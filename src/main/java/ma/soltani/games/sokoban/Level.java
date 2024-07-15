package ma.soltani.games.sokoban;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Level extends JPanel
{
    private Image mario;

    public Level()
    {
        Dimension d = new Dimension();
        d.width = 800;
        d.height = 600;
        setPreferredSize(d);

        ImageIcon IC = new ImageIcon(Objects.requireNonNull(getClass().getResource("/playerFace.png")));
        this.mario = IC.getImage();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(mario, 0, 0, null);
    }
}
