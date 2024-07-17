package ma.soltani.games.sokoban;

import ma.soltani.games.sokoban.data.Map;
import ma.soltani.games.sokoban.helpers.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener
{
    private final int MAP_WIDTH = 8;
    private final int MAP_HEIGHT = 7;
    private final int MAP_TILE_SIZE = 64;

    private Image block;
    private Image crate;
    private Image environment;
    private Image ground;
    private Image player;
    private Map map;

    public Game()
    {
        setPreferredSize(new Dimension(MAP_WIDTH * MAP_TILE_SIZE, MAP_HEIGHT * MAP_TILE_SIZE));
        this.loadImages();
        this.map = new Map();
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
}
