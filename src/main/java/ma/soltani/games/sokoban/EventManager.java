package ma.soltani.games.sokoban;

import ma.soltani.games.sokoban.data.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventManager implements KeyListener
{
    private final int MOVE_STEP = 1;

    private Player player;
    private Graphics g;

    public EventManager(Player p, Graphics g){
        this.player = p;
        this.g = g;
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed code=" + e.getKeyCode() + ", char=" + e.getKeyChar());
        int key = e.getKeyCode();

        int dx = 0;
        int dy = 0;

        if (key == KeyEvent.VK_LEFT) {
            dx = -MOVE_STEP;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = MOVE_STEP;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -MOVE_STEP;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = MOVE_STEP;
        }

        player.moveX(dx);
        player.moveY(dy);

        player.render(g);
    }

    @Override
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

        player.render(g);
    }
}
