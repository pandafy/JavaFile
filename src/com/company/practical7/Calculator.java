package com.company.practical7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Applet implements ActionListener {

    private TextField t;
    private String s0 = "";
    private String s1 = "";
    private String s2 = "";
    private Button[] buttons = new Button[10];
    private Button add, sub, mul, div, mod, eq, clear, dec;

    public void init() {

        t = new TextField(16);
        t.addActionListener(this);

        //Set Background Color
        setBackground(Color.lightGray);

        //Set Layout
        setLayout(new GridLayout(4,5));

        int k = 0;
        for (int i = 0; i < 10; i++) {

            buttons[i] = new Button("" + k);
            k++;
            add(buttons[i]);
            buttons[i].addActionListener(this);

        }

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        mod = new Button("%");
        clear = new Button("C");
        eq = new Button("=");
        dec = new Button(".");

        add(dec);
        add(eq);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(clear);
        add(t);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clear.addActionListener(this);
        eq.addActionListener(this);
        dec.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        // if the value is a number
        if ((Character.isDigit(s.charAt(0))) || s.charAt(0) == '.') {

            // if operand is present then add to second no
            if (!s1.equals("")) {

                s2 = s2 + s;

            } else {

                s0 = s0 + s;
            }

            // set the value of text
            t.setText(s0 + s1 + s2);

        } else if (s.charAt(0) == 'C') {

            // clear the one letter
            s0 = s1 = s2 = "";

            // set the value of text
            t.setText(s0 + s1 + s2);

        } else if (s.charAt(0) == '=') {

            double te;

            // store the value in 1st
            if (s1.equals("+")) {

                te = (Double.parseDouble(s0) + Double.parseDouble(s2));

            } else if (s1.equals("-")) {

                te = (Double.parseDouble(s0) - Double.parseDouble(s2));

            } else if (s1.equals("/")) {

                te = (Double.parseDouble(s0) / Double.parseDouble(s2));

            } else if(s1.equals("%")) {

                te = (Double.parseDouble(s0) % Double.parseDouble(s2));

            } else {

                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            }

            // set the value of text
            t.setText(s0 + s1 + s2 + "=" + te);

            // convert it to string
            s0 = Double.toString(te);

            s1 = s2 = "";

        } else {

            // if there was no operand
            if (s1.equals("") || s2.equals("")) {
                s1 = s;
            // else evaluate
            } else {

                double te;

                // store the value in 1st
                if (s1.equals("+")) {

                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));

                } else if (s1.equals("-")) {

                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));

                } else if (s1.equals("/")) {

                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));

                } else if (s1.equals("%")) {

                    te = (Double.parseDouble(s0) % Double.parseDouble(s2));

                } else {

                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                }

                // convert it to string
                s0 = Double.toString(te);

                // place the operator
                s1 = s;

                // make the operand blank
                s2 = "";

            }

            // set the value of text
            t.setText(s0 + s1 + s2);

        }

    }

}
