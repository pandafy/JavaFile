package com.company.practical2;

public class BoxConsOverloading {

    private int width;
    private int height;
    private int depth;

    //No Argument constructor

    public BoxConsOverloading() {

        System.out.println("No Argument Constructor - " + volume());

    }

    //All Argument Constructor

    public BoxConsOverloading(int w, int h, int d) {

        width = w;
        height = h;
        depth = d;
        System.out.println("All Argument Constructor - " + volume());

    }

    //One Argument Constructor

    public BoxConsOverloading(int a) {

        width = height = depth = a;
        System.out.println("Single Argument Constructor - " + volume());

    }

    private int volume() {

        return width * height * depth;

    }

    public static void main(String[] args) {

        BoxConsOverloading box1 = new BoxConsOverloading(2,3,4);

        BoxConsOverloading box2 = new BoxConsOverloading();

        BoxConsOverloading box3 = new BoxConsOverloading(5);

    }

}
