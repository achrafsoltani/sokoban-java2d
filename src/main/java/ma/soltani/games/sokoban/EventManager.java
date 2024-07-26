package ma.soltani.games.sokoban;

import ma.soltani.games.sokoban.data.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventManager implements KeyListener
{
    private Player player;

    public EventManager(Player p){
        this.player = p;
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

        player.moveX(dx);
        player.moveY(dy);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
