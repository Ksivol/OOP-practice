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
    private JLabel label;
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
        initLabel();
        initPanel();
        frameInit ();
    }

    private void initLabel ()
    {
        label = new JLabel(" ");
        add (label, BorderLayout.SOUTH);
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
                if (e.getButton() == MouseEvent.BUTTON3)
                    game.pressRightButton (coord);
                if (e.getButton() == MouseEvent.BUTTON2)
                    game.start();
                label.setText(getMessage ());
                panel.repaint();

            }
        });
        panel.setPreferredSize(new Dimension(
                Ranges.getSize().x*IMAGE_SIZE,
                Ranges.getSize().y*IMAGE_SIZE));
        add (panel);
    }

    private String getMessage()
    {
        switch (game.getState())
        {
            case PLAYED: return  "Think twice!";
            case BOMBED: return  "YOU LOSE! BIG BA-DA-BOOM!";
            case WINNER: return  "CONGRATULATIONS!";
            default    : return  "Welcome";
        }
    }

    protected void frameInit()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//закрыте программы
        setTitle("Java Sweeper");
        setResizable(false);//не изменный размер окна
        setVisible(true);
        pack ();
        setLocationRelativeTo(null);//по центру
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
