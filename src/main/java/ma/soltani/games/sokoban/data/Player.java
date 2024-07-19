package ma.soltani.games.sokoban.data;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Player
{
    private Image image;
    private int x;
    private int y;
    private int spriteSize;

    public Player(int x, int y, int spriteSize)
    {
        this.x = x;
        this.y = y;
        this.spriteSize = spriteSize;
        ImageIcon IC = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Player/player_01.png")));
        this.image = IC.getImage();
    }

    public void render(Graphics g)
    {
        g.drawImage(this.image, x*spriteSize, y*spriteSize, null);
    }

    public void moveX(int dx)
    {
        this.x += dx;
    }

}
