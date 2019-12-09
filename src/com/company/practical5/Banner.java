package com.company.practical5;

import java.applet.Applet;
import java.awt.*;

public class Banner extends Applet implements Runnable {

    private String display;
    private int x, y, flag;

    public void init() {

        display = "Hello Everyone!";
        x = 100;
        y = 100;
        flag = 1;

        Thread t = new Thread(this, "MyThread");
        t.start();

    }

    public void update() {

        x = x + 10 * flag;
        if (x > 300) {

            flag = -1;
        }
        if (x < 100) {

            flag = 1;

        }

    }

    public void run() {

        while (true) {

            repaint();
            update();
            try {

                // creating a pause of 1 second
                // so that the movement is recognizable

                Thread.sleep(1000);

            } catch (InterruptedException ie) {

                System.out.println(ie);

            }

        }

    }

    public void paint(Graphics g) {

        g.drawString(display, x, y);

    }

}
