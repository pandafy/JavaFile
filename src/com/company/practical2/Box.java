package com.company.practical2;

import java.util.Scanner;

public class Box {

    //Instance Variables
    public int width;
    public int height;
    public int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void print() {

        System.out.println("Height = " + height + "\nWidth = " + width + "\nDepth = " + depth);

    }

    public int volume() {

        return width * height * depth;

    }

//    public static void main(String[] args) {
//
//        Box box = new Box();
//        System.out.print("Enter the width, depth and height of the Box : ");
//        Scanner s = new Scanner(System.in);
//        box.width = s.nextInt();
//        box.depth = s.nextInt();
//        box.height = s.nextInt();
//        System.out.println("Volume of the Box is : " + box.volume());
//
//    }

}
