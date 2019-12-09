package com.company.practical3;

import java.util.Scanner;

public class Shape {

    public int a;
    public int b;

    public void get(int a, int b) {

        this.a = a;
        this.b = b;

    }
    public void print() {

        System.out.println(a + " and " + b);

    }

}

class Rectangle extends Shape {

    @Override
    public void get(int length,int breadth) {
        super.get(length,breadth);
    }

    @Override
    public void print() {

        System.out.println("Length = " + a + " and Breadth = " + b);

    }

}

class TestShape{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Shape rect = new Rectangle();
        System.out.print("Enter the dimensions of Rectangle : ");
        rect.get(s.nextInt(),s.nextInt());
        rect.print();

    }

}
