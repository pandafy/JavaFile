package com.company.practical2;

public class ThisBox {

    private int width;
    private int height;
    private int depth;

    public ThisBox(int width, int height, int depth) {

        //'this' keyword is used to refer current class
        // instance variables
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    private int volume() {

        return width * height * depth;

    }

    public static void main(String[] args) {

        ThisBox box1 = new ThisBox(2,4,6);
        System.out.println("Volume of the Box is : " + box1.volume());

    }

}
