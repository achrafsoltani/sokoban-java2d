package ma.soltani.games.sokoban;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.Timer;

public class Level extends JPanel implements ActionListener
{
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private final int INITIAL_X = 40;
    private final int INITIAL_Y = 40;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;

    private Image ground;
    private Timer timer;
    private int x, y;

    public Level()
    {


        Dimension d = new Dimension();
        d.width = 800;
        d.height = 600;
        //setPreferredSize(d);

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        x = INITIAL_X;
        y = INITIAL_Y;

        ImageIcon ii = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Ground/ground_01.png")));
        ground = ii.getImage();

        timer = new Timer(INITIAL_DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(ground, x, y, this);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x += 1;
        y += 1;

        if (y > B_HEIGHT) {

            y = INITIAL_Y;
            x = INITIAL_X;
        }

        repaint();
    }
}
