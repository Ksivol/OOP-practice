package ru.ssau.tk.Practice_SAS.Game1.Sweeper;

public class Game {
    public Game (int cols, int rows)
    {
        Ranges.setSize(new Coord(cols, rows));
    }

    public Box getBox (Coord coord)
    {
        return Box.values()[(coord.y + coord.x) % Box.values().length];
    }
}
