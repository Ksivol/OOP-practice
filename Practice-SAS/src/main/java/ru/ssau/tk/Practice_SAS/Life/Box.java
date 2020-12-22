package ru.ssau.tk.Practice_SAS.Life;

import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {

    Cell cell;
    public Box(int x, int y, Cell cell) {
        super();
        this.cell = cell;
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.BLUE);
    }

}
