package ma.soltani.games.sokoban.data;

import ma.soltani.games.sokoban.helpers.ImageLoader;
import ma.soltani.games.sokoban.helpers.MapGenerator;

import java.awt.*;

public class Map
{
    private Image block;
    private Image crate;
    private Image environment;
    private Image ground;
    private Image player;

    private Tile[][] tiles;
    private int tileSize;

    public Map(int tileSize)
    {
        this.loadImages();
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
        Image img = this.block;

        for (int y = 0; y < 7; y++)
        {
            for (int x = 0; x < 8; x++)
            {
                if (tiles[y][x].getCode().equals("BLK")){
                    img = this.block;
                } else if (tiles[y][x].getCode().equals("CRT")) {
                    img = this.crate;
                } else if (tiles[y][x].getCode().equals("ENV")) {
                    img = this.environment;
                } else if (tiles[y][x].getCode().equals("GRD")) {
                    img = this.ground;
                }
                g.drawImage(img, tiles[y][x].getX() * this.tileSize, tiles[y][x].getY() * this.tileSize, null);
            }
        }
    }

    // Helper methods
    private void loadImages()
    {
        this.block = ImageLoader.loadImage("/Blocks/block_01.png");
        this.crate = ImageLoader.loadImage("/Crates/crate_01.png");
        this.environment = ImageLoader.loadImage("/Environment/environment_01.png");
        this.ground = ImageLoader.loadImage("/Ground/ground_01.png");
        this.player = ImageLoader.loadImage("/Player/player_01.png");
    }
}
