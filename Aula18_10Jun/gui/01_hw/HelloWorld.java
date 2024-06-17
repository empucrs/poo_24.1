import java.awt.*;
import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel label = new JLabel("Clique no botao: ");
        contentPane.add(label);
        JButton button = new JButton("Hello World!");
        contentPane.add(button);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}