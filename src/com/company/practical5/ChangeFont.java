package com.company.practical5;

import java.applet.Applet;
import java.awt.*;

public class ChangeFont extends Applet {

    Font f1 = new Font("Arial",Font.BOLD,20);
    Font f2 = new Font(Font.SERIF,Font.ITALIC,20);

    public void paint(Graphics g) {

        g.drawString("Tabassum Jahangir",50, 70);

        g.setFont(f1);
        g.drawString("Sana Jahangir",50, 100);

        g.setFont(f2);
        g.drawString("Sadaf Jahangir",50,130);

    }

}
