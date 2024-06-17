import java.awt.*;
import javax.swing.*;

public class Tela {

    private JFrame telaprincipal;

    public Tela(){
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
        lcP1.add(new JTextField(30));
        leftContainer.add(lcP1);

            // entrada de dados "Nome do funcionario"
        JPanel lcP2 = new JPanel(new GridLayout(1, 2));
        lcP2.add(new JLabel("Nome"));
        lcP2.add(new JTextField(30));
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
        lcP5.add(new JTextField(8));
        leftContainer.add(lcP5);

            // entrada de dados "Botões de ação/cadastro"
        JPanel lcP6 = new JPanel(new GridLayout(1, 3));
        lcP6.add(new JButton("Limpar"));
        lcP6.add(new JLabel("    "));
        lcP6.add(new JButton("Salvar"));
        leftContainer.add(lcP6);

        // painel da direita
        JPanel rightContainer = new JPanel(new FlowLayout(FlowLayout.LEADING));
        String[] colunas = new String[] {
            "ID", "Nome", "Sal Bruto", "Sal Líquido", "Ativo", "Departamento"
        };         
        Object[][] dados = new Object[][] {
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""}
        };
        JTable jt = new JTable(dados, colunas);
        rightContainer.add(jt);

        Container mainContainer = telaprincipal.getContentPane();
        mainContainer.setLayout(new GridLayout(1,2));
        mainContainer.add(leftContainer);
        mainContainer.add(rightContainer);

        telaprincipal.pack();
        telaprincipal.setLocationRelativeTo(null);
    }

    public void run(){
        telaprincipal.setVisible(true);
    }

    
}
