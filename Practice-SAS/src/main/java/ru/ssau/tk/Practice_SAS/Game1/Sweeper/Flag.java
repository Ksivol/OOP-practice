package ru.ssau.tk.Practice_SAS.Game1.Sweeper;

public class Flag {
    private Matrix flagMap;
    private int countOfCloseBoxes;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
        countOfCloseBoxes = Ranges.getSize().x * Ranges.getSize().y;
    }

    Box get(Coord coord) {
        return flagMap.get(coord);
    }

    public void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
        countOfCloseBoxes--;
    }

    void toggleFlagedToBox(Coord coord) {
        switch (flagMap.get(coord)) {
            case CLOSED:
                setClosedToBox(coord);
                break;
            case FLAGED:
                setFlagedToBox(coord);
                break;

        }
    }

    public void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
    }

    int getCountOfClosedBoxes() {
        return countOfCloseBoxes;
    }

    void setBombedToBox(Coord coord) {
        flagMap.set(coord, Box.BOMBED);
    }

    void setOpenedToClosedBombBox(Coord coord) {
        if (flagMap.get(coord) == Box.CLOSED)
            flagMap.set(coord, Box.OPENED);
    }

    void setNoBombToFlagedSafeBox(Coord coord) {
        if (flagMap.get(coord) == Box.FLAGED)
            flagMap.set(coord, Box.NOBOMB);
    }

    int getCountOfFlagedBoxesAround(Coord coord) {
        int count = 0;
        for (Coord around : Ranges.getCoordsAround(coord))
            if (flagMap.get(around) == Box.FLAGED)
                count++;
        return count;
    }

}
