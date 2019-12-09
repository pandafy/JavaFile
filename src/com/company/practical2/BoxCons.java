package com.company.practical2;

public class BoxCons {

    private int width;
    private int height;
    private int depth;

    //All argument constructor
    public BoxCons(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    private int volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        BoxCons box = new BoxCons(2,3,4);
        System.out.println("Volume of the Box is : " + box.volume());

    }

}
