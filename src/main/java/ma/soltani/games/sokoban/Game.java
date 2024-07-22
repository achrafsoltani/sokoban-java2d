package ma.soltani.games.sokoban;

import ma.soltani.games.sokoban.data.Map;
import ma.soltani.games.sokoban.data.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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
        this.player = new Player(1, 3, this.MAP_TILE_SIZE);
        setFocusable(true);
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

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        System.out.println("key pressed: "+key);
        int dx = 0;
        int dy = 0;

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }

        this.player.moveX(dx);
        this.player.moveY(dy);
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();
        int dx = 0;
        int dy = 0;

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }

        this.player.moveX(dx);
        this.player.moveY(dy);
    }
}
