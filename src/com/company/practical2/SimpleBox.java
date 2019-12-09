package com.company.practical2;

import java.util.Scanner;

public class SimpleBox {

    //Instance Variable
    private int width;
    private int height;
    private int depth;

    private void volume() {

        System.out.println("Volume of the Box is : " + width * height * depth);

    }

    public static void main(String[] args) {

        SimpleBox box1 = new SimpleBox();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the width, depth and height of the first Box : ");
        box1.width = s.nextInt();
        box1.depth = s.nextInt();
        box1.height = s.nextInt();
        box1.volume();
        SimpleBox box2 = new SimpleBox();
        System.out.print("Enter the width, depth and height of the second Box : ");
        box2.width = s.nextInt();
        box2.depth = s.nextInt();
        box2.height = s.nextInt();
        box2.volume();

    }

}
