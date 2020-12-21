package ru.ssau.tk.Practice_SAS.Game1;

import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

    private JPanel panel;
    private final int COLS = 15;
    private final int ROWS = 1;
    private final int IMAGE_SIZE = 50;


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
        panel = new JPanel()
        {
            @Override
            protected void paintComponent (Graphics g)
            {
                super.paintComponent(g);
                g.drawImage(getImage("bomb"),0, 0, this);
                //g.drawImage(getImage("num1"),IMAGE_SIZE, 0, this);
            }
        };
        panel.setPreferredSize(new Dimension(COLS*IMAGE_SIZE,ROWS*IMAGE_SIZE));
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

    private Image getImage (String name)
    {
            ImageIcon icon = new ImageIcon ("res/img/" + name.toLowerCase() + ".png");
            return icon.getImage();

    }

}
