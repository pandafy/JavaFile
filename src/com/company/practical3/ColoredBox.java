package com.company.practical3;

import com.company.practical2.Box;

public class ColoredBox extends Box {

    public String color = "Black";

    public ColoredBox(int width, int height, int depth) {
        super(width, height, depth);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Color = " + color);
    }
}

class TestColoredBox {

    public static void main(String[] args) {

        Box colBox = new ColoredBox(2,3,5);
        colBox.print();

    }

}
