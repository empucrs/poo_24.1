import javax.swing.*;
import java.awt.*;

public class Tela {

    public static void main(String[] args) {
        JFrame telaprincipal = new JFrame("Exercicio Swing");
        telaprincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel leftContainer = new JPanel(new GridLayout(3, 1));
        leftContainer.add(new JLabel("Detalhes do funcionário"));

        JPanel lcP1 = new JPanel(new GridLayout(1, 2));
        lcP1.add(new JLabel("ID"));
        lcP1.add(new JTextField(30));
        leftContainer.add(lcP1);

        JPanel lcP2 = new JPanel(new GridLayout(1, 2));
        lcP2.add(new JLabel("Nome"));
        lcP2.add(new JTextField(30));
        leftContainer.add(lcP2);



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
        telaprincipal.setVisible(true);
        
    }

    
}