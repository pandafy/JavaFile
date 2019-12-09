package com.company.practical5;

import java.applet.Applet;
import java.awt.*;

public class LifecycleMethods extends Applet {

    String msg = "Hello! How are you?";

    public void init() {

        msg = msg + " init()";

    }

    public void start() {

        msg = msg + " start()";

    }

    public void paint(Graphics g) {

        msg = msg + " paint()";
        g.drawString(msg,20,40);

    }

    public void stop() {

        msg = msg + " stop()";

    }

    public void destroy() {

        msg = msg + " destroy()";

    }

}
