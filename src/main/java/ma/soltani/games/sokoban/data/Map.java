package ma.soltani.games.sokoban.data;

import ma.soltani.games.sokoban.helpers.ImageLoader;
import ma.soltani.games.sokoban.helpers.MapGenerator;

import java.awt.*;

public class Map
{
    private Tile[][] tiles;
    private int tileSize;

    public Map(int tileSize)
    {
        this.tiles = MapGenerator.generateMap();
        this.tileSize = tileSize;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[][] tiles) {
        this.tiles = tiles;
    }

    public void render(Graphics g)
    {
        Image img = ImageLoader.loadImage("/Blocks/block_01.png");

        for (int y = 0; y < 7; y++)
        {
            for (int x = 0; x < 8; x++)
            {
                g.drawImage(img, tiles[y][x].getX() * this.tileSize, tiles[y][x].getY() * this.tileSize, null);
            }
        }
    }
}
