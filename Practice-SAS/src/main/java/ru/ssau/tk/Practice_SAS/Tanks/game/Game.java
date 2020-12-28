package ru.ssau.tk.Practice_SAS.Tanks.game;

import ru.ssau.tk.Practice_SAS.Tanks.display.Display;
import ru.ssau.tk.Practice_SAS.Tanks.utils.Time;

public class Game implements Runnable {

    public static final int WIGHT = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "Tanks";
    public static final int CLEAR_COLOR = 0xff000000;
    public static final int NUM_BUFFERS = 3;

    public static final float UPDATE_RATE = 60.0f;
    public static final float UPDATE_INTERVAL = Time.SECOND / UPDATE_RATE;
    public static final long IDLE_TIME = 1;

    private boolean running;
    private Thread gameThread;

    public Game() {
        running = false;
        Display.create(WIGHT, HEIGHT, TITLE, CLEAR_COLOR, NUM_BUFFERS);
    }

    public synchronized void start() {

        if (running)
            return;

        running = true;
        gameThread = new Thread(this);
        gameThread.start();

    }

    public synchronized void stop() {

        if (!running)
            return;

        running = false;

        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cleanup();
    }

    private void update() {

    }

    private void render() {

    }

    public void run() {

        float delta = 0;

        long lastTime = Time.get();
        while (running) {
            long now = Time.get();
            long elapsedTime = now - lastTime;
            lastTime = now;

            boolean render = false;
            delta += (elapsedTime / UPDATE_INTERVAL);
            while (delta > 1) {
                update();
                delta--;
                render = true;
            }
            if (render)
                render();
            else {
                try {
                    Thread.sleep(IDLE_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }

    }

    private void cleanup() {
        Display.destroy();
    }

}
