package com.company.practical7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEvent extends Applet implements ActionListener {

    TextField text;
    TextArea area;
    private static final String newLine = "\n";

    public void init() {

        text = new TextField(50);

        //Adding ActionListener to text field
        text.addActionListener(this);

        //Adding text field in Applet
        add(text);

        area = new TextArea(5,50);

        //Making Text area non-editable
        area.setEditable(false);

        //Adding text area in Applet
        add(area);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String txt = text.getText();

        //Adding Text to the text area
        area.append(txt + newLine);

    }

}
