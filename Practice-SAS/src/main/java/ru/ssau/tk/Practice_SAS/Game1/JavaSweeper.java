package ru.ssau.tk.Practice_SAS.Game1;

import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

    private JPanel panel;

    public static void main(String[] args)
    {
        new JavaSweeper();
    }

    private JavaSweeper ()
    {
        initPanel();
        frameInit ();
    }

    private void initPanel ()
    {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        add (panel);
    }

    protected void frameInit()
    {
        pack ();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//закрыте программы
        setTitle("Java Sweeper");
        setLocationRelativeTo(null);//по центру
        setResizable(false);//не изменный размер окна
        setVisible(true);
    }

}
