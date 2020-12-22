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

    public void setOpenedToBox(Coord coord)
    {
        flagMap.set (coord, Box.OPENED);
    }

    void toggleFlagedToBox (Coord coord)
    {
        switch (flagMap.get(coord))
        {
            case CLOSED : setClosedToBox (coord); break;
            case FLAGED : setFlagedToBox (coord); break;

        }
    }

    public void setFlagedToBox(Coord coord)
    {
        flagMap.set (coord, Box.CLOSED);
    }

    public void setClosedToBox(Coord coord)
    {
        flagMap.set (coord, Box.FLAGED);
    }

}
