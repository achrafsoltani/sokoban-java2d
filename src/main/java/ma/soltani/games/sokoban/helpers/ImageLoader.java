package ma.soltani.games.sokoban.helpers;

import javax.swing.*;
import java.awt.Image;
import java.util.Objects;

public class ImageLoader
{
    public static Image loadImage(String path)
    {
        ImageIcon ii = new ImageIcon(Objects.requireNonNull(ImageLoader.class.getResource(path)));
        return ii.getImage();
    }
}
