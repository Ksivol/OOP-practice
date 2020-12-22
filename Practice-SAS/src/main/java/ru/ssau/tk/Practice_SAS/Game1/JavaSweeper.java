package ru.ssau.tk.Practice_SAS.Game1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import ru.ssau.tk.Practice_SAS.Game1.Sweeper.Box;
import ru.ssau.tk.Practice_SAS.Game1.Sweeper.Coord;
import ru.ssau.tk.Practice_SAS.Game1.Sweeper.Game;
import ru.ssau.tk.Practice_SAS.Game1.Sweeper.Ranges;

public class JavaSweeper extends JFrame {

    private Game game;

    private JPanel panel;
    private final int COLS = 9;
    private final int ROWS = 9;
    private final int BOMBS = 10;
    private final int IMAGE_SIZE = 50;


    public static void main(String[] args)
    {
        new JavaSweeper();
    }

    private JavaSweeper ()
    {
        game = new Game (COLS, ROWS, BOMBS);
        game.start();
        setImages();
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
                for (Coord coord : Ranges.getAllCoords())
                    g.drawImage((Image)game.getBox(coord).image,
                            coord.x*IMAGE_SIZE,coord.y*IMAGE_SIZE,this);

            }
        };

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e)
            {
                int x = e.getX() / IMAGE_SIZE;
                int y = e.getY() / IMAGE_SIZE;
                Coord coord = new Coord(x,y);
                if (e.getButton() == MouseEvent.BUTTON1)
                    game.pressLeftButton (coord);
                panel.repaint();
            }
        });
        panel.setPreferredSize(new Dimension(
                Ranges.getSize().x*IMAGE_SIZE,
                Ranges.getSize().y*IMAGE_SIZE));
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
        setIconImage(getImage("icon"));


    }

    private Image getImage (String name)
    {
            ImageIcon icon = new ImageIcon ("res/img/" + name.toLowerCase() + ".png");
            return icon.getImage();

    }

    private void setImages ()
    {
        for (Box box : Box.values())
            box.image = getImage(box.name());
    }

}
