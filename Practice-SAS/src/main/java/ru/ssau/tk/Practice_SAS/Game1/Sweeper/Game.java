package ru.ssau.tk.Practice_SAS.Game1.Sweeper;

public class Game {

    Matrix bombMap;

    public Game (int cols, int rows)
    {
        Ranges.setSize(new Coord(cols, rows));
    }

    public void start ()
    {
        bombMap = new Matrix(Box.BOMB);
    }

    public Box getBox (Coord coord)
    {
        return bombMap.get(coord);
    }
}
