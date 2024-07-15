package ma.soltani.games.sokoban;

import javax.swing.*;
import java.awt.*;

public class Level extends JPanel
{
    public Level()
    {
        Dimension d = new Dimension();
        d.width = 800;
        d.height = 600;
        setPreferredSize(d);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
}
