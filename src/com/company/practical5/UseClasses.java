package com.company.practical5;

import java.applet.Applet;
import java.awt.*;

public class UseClasses extends Applet {

    public void paint(Graphics g) {

        int[] x = {640, 670, 670, 610, 610, 640};
        int[] y = {205, 230, 270, 270, 230, 205};

        g.setColor(Color.blue);
        g.drawLine(10, 10, 100, 100);

        g.setColor(Color.black);
        g.drawRect(200, 50, 110, 70);

        g.setColor(Color.pink);
        g.fillRect(400, 50, 110, 70);

        g.setColor(Color.blue);
        g.drawRoundRect(600, 50, 110, 70, 15, 15);

        g.setColor(Color.lightGray);
        g.fillRoundRect(10, 200, 110, 70, 15, 15);

        g.setColor(Color.red);
        g.drawOval(205, 205, 100, 70);

        g.setColor(Color.yellow);
        g.fillOval(405, 205, 100, 70);

        g.setColor(Color.cyan);
        g.drawPolygon(x, y, 5);

    }

}
