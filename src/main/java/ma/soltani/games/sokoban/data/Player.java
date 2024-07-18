package ma.soltani.games.sokoban.data;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Player
{
    private Image image;

    public Player()
    {
        ImageIcon IC = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Player/player_01.png")));
        this.image = IC.getImage();
    }

    public void render(Graphics g)
    {
        g.drawImage(this.image, 64, 3*64, null);
    }
}
