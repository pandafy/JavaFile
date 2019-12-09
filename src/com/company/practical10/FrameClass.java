package com.company.practical10;

import java.awt.*;

public class FrameClass extends Frame {

    public FrameClass() {

        Button b = new Button("click me");

        // setting button position
        b.setBounds(100,100,80,30);

        //adding button into frame
        add(b);

        //frame size 300 width and 300 height
        setSize(300,300);

        //no layout manager
        setLayout(null);

        //now frame will be visible, by default not visible
        setVisible(true);

    }

    public static void main(String args[]){

       new FrameClass();

    }

}
