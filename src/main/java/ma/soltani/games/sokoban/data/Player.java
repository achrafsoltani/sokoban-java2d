package ma.soltani.games.sokoban.data;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Player
{
    private Image image_down;
    private Image image_up;
    private Image image_right;
    private Image image_left;
    private Image selected;
    private int x;
    private int y;
    private int spriteSize;

    public Player(int x, int y, int spriteSize)
    {
        this.x = x;
        this.y = y;
        this.spriteSize = spriteSize;
        ImageIcon down = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Player/player_01.png")));
        ImageIcon up = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Player/player_02.png")));
        ImageIcon right = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Player/player_16.png")));
        ImageIcon left = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Player/player_11.png")));

        this.image_down = down.getImage();
        this.image_up = up.getImage();
        this.image_right = right.getImage();
        this.image_left = left.getImage();

        this.selected = this.image_down;
    }

    public void render(Graphics g)
    {
        g.drawImage(this.selected, x*spriteSize, y*spriteSize, null);
    }

    public void moveX(int dx)
    {
        this.x += dx;
        if(dx>0){
            this.selected = this.image_right;
        } else {
            this.selected = this.image_left;
        }
    }

    public void moveY(int dy)
    {
        this.y += dy;
    }
}
