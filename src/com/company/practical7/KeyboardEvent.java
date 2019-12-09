package com.company.practical7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEvent extends Applet implements KeyListener {

    private TextField textField;

    public void init() {

        textField = new TextField(20);
        add(textField);

        //Adding Key listener
        //KeyListener is notified whenever there is a change in the state of key.
        textField.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

        showStatus("Key Typed : " + e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e) {

        showStatus("Key Pressed");

    }

    @Override
    public void keyReleased(KeyEvent e) {

        showStatus("Key Released");

    }

}
