package com.company.practical7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxEvent extends Applet implements ItemListener {

    Checkbox java = null;
    Checkbox c = null;

    public void init() {

        //create checkboxes
        java = new Checkbox("Java");
        c = new Checkbox("C++");
        add(java);
        add(c);

        //add item listeners
        java.addItemListener(this);
        c.addItemListener(this);

    }

    public void paint(Graphics g){

        g.drawString("Java : " + java.getState(),150,80);
        g.drawString("C++ : " + c.getState(), 150, 120);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        repaint();

    }

}
