package ma.soltani.games.sokoban;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Level extends JPanel
{
    private Image mario;
    private Image crate;

    public Level()
    {
        Dimension d = new Dimension();
        d.width = 800;
        d.height = 600;
        setPreferredSize(d);

        // Load image method 1
        ImageIcon IC = new ImageIcon(Objects.requireNonNull(getClass().getResource("/playerFace.png")));
        this.mario = IC.getImage();

        try {
            BufferedImage crate = ImageIO.read(getClass().getResource("/crate_01.png"));
            this.crate = crate;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(mario, 0, 0, null);
        g2d.drawImage(crate, 100, 100, null);
    }
}
