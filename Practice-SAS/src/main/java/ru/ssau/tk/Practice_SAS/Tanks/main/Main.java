package ru.ssau.tk.Practice_SAS.Tanks.main;

import javax.swing.*;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import ru.ssau.tk.Practice_SAS.Tanks.display.Display;
import ru.ssau.tk.Practice_SAS.Tanks.game.Game;

public class Main {

    public static void main(String[] args) {

        Game tanks = new Game();
        tanks.start();

    }
}
