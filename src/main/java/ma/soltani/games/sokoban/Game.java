package ma.soltani.games.sokoban;

import ma.soltani.games.sokoban.data.Map;
import ma.soltani.games.sokoban.data.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel
{
    private final int MAP_WIDTH = 8;
    private final int MAP_HEIGHT = 7;
    private final int MAP_TILE_SIZE = 64;

    private Map map;
    private Player player;

    public Game()
    {
        setPreferredSize(new Dimension(MAP_WIDTH * MAP_TILE_SIZE, MAP_HEIGHT * MAP_TILE_SIZE));
        this.map = new Map(MAP_TILE_SIZE);
        this.player = new Player(1, 3, this.MAP_TILE_SIZE);
        setFocusable(true);

        this.addKeyListener(new EventManager(this.player, this));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.map.render(g);
        this.player.render(g);
        Toolkit.getDefaultToolkit().sync();
    }
}
