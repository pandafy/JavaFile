package com.company.practical7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvent extends Applet implements MouseListener, MouseMotionListener {

    private int x , y;
    private String msg = "";

    public void init() {

        //MouseListener handles the events when the mouse is not in motion.
        this.addMouseListener(this);

        //MouseMotionListener handles the events when mouse is in motion.
        this.addMouseMotionListener(this);

    }

    public void paint(Graphics g) {

        g.drawString(msg,x,y);

    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

        x = e.getX();
        y = e.getY();
        msg = "Clicked";
        repaint();

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

        x = e.getX();
        y = e.getY();
        msg = "Pressed";
        repaint();

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

        x = e.getX();
        y = e.getY();
        msg = "Released";
        repaint();

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

        x = e.getX();
        y = e.getY();
        msg = "Entered at";
        showStatus(msg + " " + x + "," + y);

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

        x = e.getX();
        y = e.getY();
        msg = "Exited at";
        showStatus(msg + " " + x + "," + y);

    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {

        x = e.getX();
        y = e.getY();
        msg = "Mouse is dragged through point";
        showStatus(msg + " " + x + "," + y);

    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {

        x = e.getX();
        y = e.getY();
        msg = "Mouse is moved to point";
        showStatus(msg + " " + x + "," + y);

    }

}
