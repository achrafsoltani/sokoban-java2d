package ma.soltani.games.sokoban.helpers;

import ma.soltani.games.sokoban.data.Tile;

public class MapGenerator
{
    public static Tile[][] generateMap()
    {
        Tile[][] tiles = new Tile[7][8];

        // First row (0)
        tiles[0][0] = new Tile("BLK", 0, 0);
        tiles[0][1] = new Tile("BLK", 1, 0);
        tiles[0][2] = new Tile("BLK", 2, 0);
        tiles[0][3] = new Tile("BLK", 3, 0);
        tiles[0][4] = new Tile("BLK", 4, 0);
        tiles[0][5] = new Tile("BLK", 5, 0);
        tiles[0][6] = new Tile("BLK", 6, 0);
        tiles[0][7] = new Tile("BLK", 7, 0);

        // Second row (1)
        tiles[1][0] = new Tile("BLK", 0, 1);
        tiles[1][1] = new Tile("GRD", 1, 1);
        tiles[1][2] = new Tile("GRD", 2, 1);
        tiles[1][3] = new Tile("BLK", 3, 1);
        tiles[1][4] = new Tile("GRD", 4, 1);
        tiles[1][5] = new Tile("GRD", 5, 1);
        tiles[1][6] = new Tile("GRD", 6, 1);
        tiles[1][7] = new Tile("BLK", 7, 1);

        // Third row (2)
        tiles[2][0] = new Tile("BLK", 0, 2);
        tiles[2][1] = new Tile("GRD", 1, 2);
        tiles[2][2] = new Tile("CRT", 2, 2);
        tiles[2][3] = new Tile("ENV", 3, 2);
        tiles[2][4] = new Tile("ENV", 4, 2);
        tiles[2][5] = new Tile("CRT", 5, 2);
        tiles[2][6] = new Tile("GRD", 6, 2);
        tiles[2][7] = new Tile("BLK", 7, 2);

        // Fourth row (3)
        tiles[3][0] = new Tile("BLK", 0, 3);
        tiles[3][1] = new Tile("GRD", 1, 3);
        tiles[3][2] = new Tile("CRT", 2, 3);
        tiles[3][3] = new Tile("ENV", 3, 3);
        tiles[3][4] = new Tile("CRT", 4, 3);
        tiles[3][5] = new Tile("GRD", 5, 3);
        tiles[3][6] = new Tile("GRD", 6, 3);
        tiles[3][7] = new Tile("BLK", 7, 3);

        // Fifth row (4)
        tiles[4][0] = new Tile("BLK", 0, 4);
        tiles[4][1] = new Tile("GRD", 1, 4);
        tiles[4][2] = new Tile("GRD", 2, 4);
        tiles[4][3] = new Tile("ENV", 3, 4);
        tiles[4][4] = new Tile("ENV", 4, 4);
        tiles[4][5] = new Tile("CRT", 5, 4);
        tiles[4][6] = new Tile("GRD", 6, 4);
        tiles[4][7] = new Tile("BLK", 7, 4);

        // Sixth row (5)
        tiles[5][0] = new Tile("BLK", 0, 5);
        tiles[5][1] = new Tile("GRD", 1, 5);
        tiles[5][2] = new Tile("GRD", 2, 5);
        tiles[5][3] = new Tile("BLK", 3, 5);
        tiles[5][4] = new Tile("GRD", 4, 5);
        tiles[5][5] = new Tile("GRD", 5, 5);
        tiles[5][6] = new Tile("GRD", 6, 5);
        tiles[5][7] = new Tile("BLK", 7, 5);

        // Seventh row (6)
        tiles[6][0] = new Tile("BLK", 0, 6);
        tiles[6][1] = new Tile("BLK", 1, 6);
        tiles[6][2] = new Tile("BLK", 2, 6);
        tiles[6][3] = new Tile("BLK", 3, 6);
        tiles[6][4] = new Tile("BLK", 4, 6);
        tiles[6][5] = new Tile("BLK", 5, 6);
        tiles[6][6] = new Tile("BLK", 6, 6);
        tiles[6][7] = new Tile("BLK", 7, 6);

        return tiles;
    }
}
