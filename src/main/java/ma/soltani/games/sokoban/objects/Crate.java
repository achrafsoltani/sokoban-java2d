package ma.soltani.games.sokoban.objects;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Crate extends JPanel
{
    private final Image image;

    public Crate()
    {
        Dimension d = new Dimension();
        d.width = 64;
        d.height = 64;
        setPreferredSize(d);

        // Load image method 1
        ImageIcon IC = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Crates/crate_01.png")));
        this.image = IC.getImage();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(this.image, 0, 0, null);
    }
}
