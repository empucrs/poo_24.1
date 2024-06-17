import javax.swing.*;
import java.awt.*;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo - menus");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu fileMenu = new JMenu("Arquivo");
        fileMenu.add(new JMenuItem("Abrir texto"));
        fileMenu.add(new JMenuItem("Abrir binário"));
        fileMenu.add(new JMenuItem("Abrir json"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Salvar texto"));
        fileMenu.add(new JMenuItem("Salvar binário"));
        fileMenu.add(new JMenuItem("Salvar json"));

        JMenu editMenu = new JMenu("Ajuda");

        JMenuBar menubar = new JMenuBar();
        menubar.add(fileMenu);
        menubar.add(editMenu);

        frame.setJMenuBar(menubar);
        frame.setVisible(true);
    }
}