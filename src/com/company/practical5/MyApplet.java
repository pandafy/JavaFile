package com.company.practical5;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {

    public void init() {

        //Setting Background and Foreground Color

        setBackground(Color.yellow);
        setForeground(Color.red);

    }

    public void paint(Graphics g) {

        //Message

        g.drawString("Hello World",70,200);

    }

}
