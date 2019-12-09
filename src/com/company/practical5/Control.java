package com.company.practical5;

import java.applet.Applet;
import java.awt.*;

public class Control extends Applet {

    public void init() {

        Checkbox checkbox = new Checkbox("Checkbox");
        this.add(checkbox);

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        this.add(new Checkbox("CB 1", checkboxGroup, true));
        this.add(new Checkbox("CB 2", checkboxGroup, false));
        this.add(new Checkbox("CB 3", checkboxGroup, false));

        Choice choice = new Choice();
        choice.add("Product A");
        choice.add("Product B");
        choice.add("Product C");
        this.add(choice);

        Label label = new Label("Showing search results");
        this.add(label);

        TextField t = new TextField("TextField", 40);
        this.add(t);

        Button button = new Button("Search");
        this.add(button);

        List list = new List(3);
        list.add("Product X");
        list.add("Product Y");
        list.add("Product Z");
        this.add(list);

        TextArea textArea = new TextArea("TextArea", 10, 30);
        this.add(textArea);

    }

    public void paint(Graphics g) {

        showStatus("Welcome");

    }

}
