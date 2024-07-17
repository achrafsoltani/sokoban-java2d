package ma.soltani.games.sokoban.helpers;

import ma.soltani.games.sokoban.data.Tile;

public class MapGenerator
{
    public static Tile[][] generateMap()
    {
        Tile[][] tiles = new Tile[7][8];

        tiles[0][0] = new Tile("BLK", 0, 0);
        tiles[0][1] = new Tile("BLK", 0, 1);
        tiles[0][2] = new Tile("BLK", 0, 2);
        tiles[0][3] = new Tile("BLK", 0, 3);
        tiles[0][4] = new Tile("BLK", 0, 4);
        tiles[0][5] = new Tile("BLK", 0, 5);
        tiles[0][6] = new Tile("BLK", 0, 6);
        tiles[0][7] = new Tile("BLK", 0, 7);

        return tiles;
    }
}
