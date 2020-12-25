package ru.ssau.tk.Practice_SAS.Tanks.display;

import javax.swing.*;
import java.awt.*;

public class Display {

    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;

    public static void create(int wight, int height, String title){
        if(created)
            return;
        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = new Canvas();

        Dimension size = new Dimension(wight, height);
        content.setPreferredSize(size);

        window.setResizable(false);
        window.getContentPane().add(content);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }

}
