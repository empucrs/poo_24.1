import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class Tela {

    private JFrame telaprincipal;
    private JTextField txtID, txtNome, txtSalario;
    private JRadioButton ativoBtn, inativoBtn;
    private JComboBox comboDepartamentos;

    String[] cabecalho;
    Object[][] dados;
    JTable jt;



    private List<Funcionario> listaDeFuncionarios;

    public Tela(){
        listaDeFuncionarios = new ArrayList<>();
        Funcionario aux = new Funcionario();
        aux.Departamento="Vendas";
        aux.ID="10083346";
        aux.Nome="Edson Moreno";
        aux.Salario=1000;
        aux.StatusAtivo=true;
        listaDeFuncionarios.add(aux);
        aux = new Funcionario();
        listaDeFuncionarios.add(aux);

        telaprincipal = new JFrame("Exercicio Swing");
        telaprincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Elaboração do menu bar da aplicação
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.add(new JMenuItem("Carregar"));
        JMenuItem miSalvar = new JMenuItem("Salvar");
        menuArquivo.add(miSalvar);
        miSalvar.addActionListener( p -> SalvaEmArquivo() );
        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuBar menuApp = new JMenuBar();
        menuApp.add(menuArquivo);
        menuApp.add(menuAjuda);
        telaprincipal.setJMenuBar(menuApp);

        // painel da esquerda
        JPanel leftContainer = new JPanel(new GridLayout(7, 1));

            // rótulo "Detalhes funcionário"
        leftContainer.add(new JLabel("Detalhes do funcionário"));

        
            // entrada de dados "ID do funcionario"
        JPanel lcP1 = new JPanel(new GridLayout(1, 2));
        lcP1.add(new JLabel("ID"));
        txtID = new JTextField(30);
        lcP1.add(txtID);
        leftContainer.add(lcP1);

            // entrada de dados "Nome do funcionario"
        JPanel lcP2 = new JPanel(new GridLayout(1, 2));
        lcP2.add(new JLabel("Nome"));
        txtNome = new JTextField(30);
        lcP2.add(txtNome);
        leftContainer.add(lcP2);

            // entrada de dados "Status do funcionario"
        JPanel lcP3 = new JPanel(new GridLayout(1, 2));
        lcP3.add(new JLabel("Status"));
        inativoBtn = new JRadioButton("Inativo");
        ativoBtn = new JRadioButton("Ativo");
        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(inativoBtn);
        statusGroup.add(ativoBtn);        
        JPanel lcP3_1 = new JPanel(new GridLayout(1,2));
        lcP3_1.add(inativoBtn);
        lcP3_1.add(ativoBtn);
        lcP3.add(lcP3_1);
        leftContainer.add(lcP3);

            // entrada de dados "Departamento do funcionario"
        JPanel lcP4 = new JPanel(new GridLayout(1, 2));
        lcP4.add(new JLabel("Departamento"));
        String [] listaDeDepartamentos = { "Vendas", "Operacional", "Financeiro", "Administração", "Transporte" };
        comboDepartamentos = new JComboBox(listaDeDepartamentos);
        comboDepartamentos.setSelectedIndex(0);
        lcP4.add(comboDepartamentos);
        leftContainer.add(lcP4);

            // entrada de dados "Salário do funcionario"
        JPanel lcP5 = new JPanel(new GridLayout(1, 2));
        lcP5.add(new JLabel("Salário"));
        txtSalario = new JTextField(8);
        lcP5.add(txtSalario);
        leftContainer.add(lcP5);

            // entrada de dados "Botões de ação/cadastro"
        JPanel lcP6 = new JPanel(new GridLayout(1, 3));
        JButton btnLimpa = new JButton("Limpar");        
        lcP6.add(btnLimpa);
        btnLimpa.addActionListener(e -> LimpaTelaDeCadastro() );

        lcP6.add(new JLabel("    "));
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(
            p->{
                // cria um novo funcionario
                Funcionario faux = new Funcionario();
                faux.ID=txtID.getText();
                faux.Nome=txtNome.getText();
                faux.StatusAtivo=((ativoBtn.isSelected())?true:false);
                faux.Departamento=(String) comboDepartamentos.getSelectedItem();
                try{
                    faux.Salario=Double.parseDouble(txtSalario.getText());
                }
                catch(Exception exc){
                    faux.Salario=0;
                }

                // adiciono na lista de funcionarios
                listaDeFuncionarios.add(faux);

                carregaTabela();
                LimpaTelaDeCadastro();
            }

        );

        lcP6.add(btnSalvar);
        leftContainer.add(lcP6);

        // painel da direita
        JPanel rightContainer = new JPanel(new BorderLayout());
        cabecalho = new String[]{
            "ID", "Nome", "Status", "Departamento", "Salario"
        };         
        dados = new Object[][]{};
        jt = new JTable(dados, cabecalho);

        JScrollPane sp = new JScrollPane(jt);
        rightContainer.add(sp, BorderLayout.NORTH);

        Container mainContainer = telaprincipal.getContentPane();
        mainContainer.setLayout(new GridLayout(1,2));
        mainContainer.add(leftContainer);
        mainContainer.add(rightContainer);

        telaprincipal.pack();
        telaprincipal.setLocationRelativeTo(null);

        carregaTabela();
    }

    private void LimpaTelaDeCadastro(){
        txtID.setText("");
        txtNome.setText("");
        txtSalario.setText("");
        ativoBtn.setSelected(false); 
        inativoBtn.setSelected(false);
        comboDepartamentos.setSelectedIndex(0);
    }

    private void carregaTabela(){
        //limpo a tabela
        int nColunas = jt.getColumnCount();
        int nLinhas = jt.getRowCount();

        // redenho a tabela
          //adiciono os dados da tabela
        Object [][] novosdados = new Object[listaDeFuncionarios.size()][5];
        int idx=0;
        for(Funcionario f : listaDeFuncionarios){
            novosdados[idx][0]=f.ID;
            novosdados[idx][1]=f.Nome;
            novosdados[idx][2]=(f.StatusAtivo?"Ativo":"Inativo");
            novosdados[idx][3]=f.Departamento;
            novosdados[idx][4]=f.Salario;
            idx++;
        }
        //lancar a nova tabela
        jt.setModel(new javax.swing.table.DefaultTableModel(novosdados, cabecalho));

    }

    private void SalvaEmArquivo(){
        Path p=null;
        BufferedWriter bf=null;
        PrintWriter writer=null;
        try{
            p = Paths.get("arquivo.dat");   
            bf = Files.newBufferedWriter(p, StandardCharsets.UTF_8);
            writer = new PrintWriter(bf);

            for(Funcionario f : listaDeFuncionarios){
                writer.print(f.ID+";");
                writer.print(f.Nome+";");
                writer.print(f.Salario+";");
                writer.print((f.StatusAtivo?"Ativo":"Inativo")+";");
                writer.print(f.Departamento+"\n");
            }
        
        }
        catch(Exception e){
            System.out.println("Erro no salvamento do arquivo");
        }
        finally{
            if(writer!=null)
                writer.close();
        }

    }

    public void run(){
        telaprincipal.setVisible(true);
    }

    
}
