package ru.ssau.tk.Practice_SAS.Game1.Sweeper;

public class Flag {
    private Matrix flagMap;

    void start ()
    {
        flagMap = new Matrix(Box.CLOSED);
    }

    Box get (Coord coord)
    {
        return flagMap.get(coord);
    }

}
