package ma.soltani.games.sokoban.data;

import ma.soltani.games.sokoban.helpers.MapGenerator;

public class Map
{
    private Tile[][] tiles;

    public Map()
    {
        Tile[][] tiles = MapGenerator.generateMap();
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[][] tiles) {
        this.tiles = tiles;
    }
}
