package ma.soltani.games.sokoban;

import java.awt.*;

public class Main
{
    public Main()
    {
        Frame f = new Frame();
        Button b = new Button();
        b.setBounds(80, 20, 100, 20);
        f.add(b);
        f.setSize(300, 250);
        f.setTitle("JavaTPoint");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main m = new Main();
    }
}
