package com.company.practical10;

import javax.swing.*;

public class Table {

    JFrame frame;
    JTable table;

    public Table() {

        frame = new JFrame();
        frame.setTitle("Table");
        String[][] data = {
                {"Tabassum", "40", "CSE"},
                {"Ekta", "7", "CSE"},
                {"Urvashi", "42", "CSE"}
        };

        String[] columnNames = {"Name", "Roll No", "Department"};
        table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);
        frame.setSize(500,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new Table();

    }

}
