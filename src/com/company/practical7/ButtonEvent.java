package com.company.practical7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent extends Applet implements ActionListener {

    Button button;
    TextField textField;

    public void init() {

        textField = new TextField(10);
        textField.setBounds(35,45,250,30);

        //Adding a text field to Applet
        add(textField);
        button = new Button("Click me!");
        button.setBounds(90,110,70,60);

        //Adding Button to Applet
        add(button);

        //Adding Action Listener to the Button
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        textField.setText("Welcome");

    }

}
