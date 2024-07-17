package ma.soltani.games.sokoban;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
    public Main()
    {
        add(new Game());
        pack();
        setTitle("Sokoban Java 2D");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EventQueue.invokeLater(() -> {
                Main ex = new Main();
                ex.setVisible(true);
        });
    }
}
