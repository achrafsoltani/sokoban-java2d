package ma.soltani.games.sokoban;

import ma.soltani.games.sokoban.data.Map;
import ma.soltani.games.sokoban.data.Player;
import ma.soltani.games.sokoban.helpers.ImageLoader;
import ma.soltani.games.sokoban.objects.Mario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener
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
        this.player = new Player();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.map.render(g);
        this.player.render(g);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
