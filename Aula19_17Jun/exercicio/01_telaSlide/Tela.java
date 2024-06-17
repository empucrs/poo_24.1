import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.JTableHeader;

public class Tela {

    private JFrame telaprincipal;
    private JTextField txtID;

    String[] colunas;
    Object[][] dados;
    JTable jt;

    private List<Funcionario> listaDeFuncionarios;

    public Tela(){
        listaDeFuncionarios = new ArrayList<>();

        telaprincipal = new JFrame("Exercicio Swing");
        telaprincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Elaboração do menu bar da aplicação
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.add(new JMenuItem("Carregar"));
        menuArquivo.add(new JMenuItem("Salvar"));
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
        JTextField txtNome = new JTextField(30);
        lcP2.add(txtNome);
        leftContainer.add(lcP2);

            // entrada de dados "Status do funcionario"
        JPanel lcP3 = new JPanel(new GridLayout(1, 2));
        lcP3.add(new JLabel("Status"));
        JRadioButton inativoBtn = new JRadioButton("Inativo");
        JRadioButton ativoBtn = new JRadioButton("Ativo");
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
        JComboBox comboDepartamentos = new JComboBox(listaDeDepartamentos);
        comboDepartamentos.setSelectedIndex(0);
        lcP4.add(comboDepartamentos);
        leftContainer.add(lcP4);

            // entrada de dados "Salário do funcionario"
        JPanel lcP5 = new JPanel(new GridLayout(1, 2));
        lcP5.add(new JLabel("Salário"));
        JTextField txtSalario = new JTextField(8);
        lcP5.add(txtSalario);
        leftContainer.add(lcP5);

            // entrada de dados "Botões de ação/cadastro"
        JPanel lcP6 = new JPanel(new GridLayout(1, 3));
        lcP6.add(new JButton("Limpar"));
        lcP6.add(new JLabel("    "));
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(
            e->{
                Funcionario faux = new Funcionario();
                faux.ID=txtID.getText();
                faux.Nome=txtNome.getText();
                faux.StatusAtivo=((ativoBtn.isSelected())?true:false);
                faux.Departamento=(String) comboDepartamentos.getSelectedItem();
                faux.Salario=Double.parseDouble(txtSalario.getText());

                listaDeFuncionarios.add(faux);

                carregaTabela();
            }

        );

        lcP6.add(btnSalvar);
        leftContainer.add(lcP6);

        // painel da direita
        JPanel rightContainer = new JPanel(new FlowLayout(FlowLayout.LEADING));
        colunas = new String[]{
            "ID", "Nome", "Sal Bruto", "Sal Líquido", "Ativo", "Departamento"
        };         
        dados = new Object[][]{
            {".", ".", ".", ".", ".", "."},
            {".", ".", ".", ".", ".", "."},
            {".", ".", ".", ".", ".", "."},
            {".", ".", ".", ".", ".", "."},
            {".", ".", ".", ".", ".", "."}
        };
        jt = new JTable(dados, colunas);
        //jt.setPreferredScrollableViewportSize(new Dimension(500, 70));
        //jt.setFillsViewportHeight(true);
        ScrollPane sp = new ScrollPane(FlowLayout.CENTER);
        sp.setPreferredSize(new Dimension(1000,400));
        sp.add(jt);
        rightContainer.add(sp, BorderLayout.CENTER);

        Container mainContainer = telaprincipal.getContentPane();
        mainContainer.setLayout(new GridLayout(1,2));
        mainContainer.add(leftContainer);
        mainContainer.add(rightContainer);

        telaprincipal.pack();
        telaprincipal.setLocationRelativeTo(null);
    }

    private void carregaTabela(){
        //limpo a tabela
        int nColunas = jt.getColumnCount();
        int nLinhas = jt.getRowCount();

        for(int i=0; i< nColunas; i++)
            jt.setValueAt(colunas[i], 0, i);        
        //adiciono o cabeçalho
        //adiciono os dados da tabela
        int linha=1;
        for(Funcionario f : listaDeFuncionarios){
            for(int i=0; i< nColunas; i++){
                jt.setValueAt(f.ID, linha, i); 
                jt.setValueAt(f.Nome, linha, i); 
                jt.setValueAt((f.StatusAtivo?"Ativo":"Inativo"), linha, i); 
                jt.setValueAt(f.Departamento, linha, i); 
                jt.setValueAt(f.Salario, linha, i); 
            }
        }

    }

    public void run(){
        telaprincipal.setVisible(true);
    }

    
}
