package ma.soltani.games.sokoban;

import ma.soltani.games.sokoban.objects.Crate;
import ma.soltani.games.sokoban.objects.Mario;

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

        add(new Mario());
        add(new Crate());
    }
}
