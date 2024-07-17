package ma.soltani.games.sokoban;

import ma.soltani.games.sokoban.helpers.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener
{
    private Image block;
    private Image crate;
    private Image environment;
    private Image ground;
    private Image player;

    public Game()
    {
        setPreferredSize(new Dimension(800, 600));
        this.loadImages();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.block, 10, 10, this);
        g.drawImage(this.crate, 50, 50, this);
        g.drawImage(this.environment, 100, 100, this);
        g.drawImage(this.ground, 150, 150, this);
        g.drawImage(this.player, 200, 200, this);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // Helper methods
    private void loadImages()
    {
        this.block = ImageLoader.loadImage("/Blocks/block_01.png");
        this.crate = ImageLoader.loadImage("/Crates/crate_01.png");
        this.environment = ImageLoader.loadImage("/Environment/environment_01.png");
        this.ground = ImageLoader.loadImage("/Ground/ground_01.png");
        this.player = ImageLoader.loadImage("/Player/player_01.png");
    }

    private void drawImages()
    {

    }
}
