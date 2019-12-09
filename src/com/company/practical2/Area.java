package com.company.practical2;

import java.util.Scanner;

public class Area {

    //Overloading allows different methods to have the same name,
    // but different signatures where the signature can differ
    // by the number of input parameters or type of input parameters or both.

    private void calculateArea(int side) {
        System.out.println("Area of Square is : " + side * side);
    }

    private void calculateArea(double base, double height) {
        System.out.println("Area of Triangle is : " + (base * height)/2);
    }

    private void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle is : " + length * breadth);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Area area = new Area();

        //Menu for user to select the geometric figure

        System.out.println("Area Calculation");
        System.out.println("1.Square\n2.Rectangle\n3.Triangle");
        char ch;
        do {
            System.out.print("Enter your choice : ");
            int n = s.nextInt();
            switch(n) {
                case 1:
                    System.out.print("Enter the side : ");
                    area.calculateArea(s.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the length and breadth : ");
                    area.calculateArea(s.nextInt(),s.nextInt());
                    break;
                case 3:
                    System.out.print("Enter the base and height (in double): ");
                    area.calculateArea(s.nextDouble(),s.nextDouble());
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.print("Press 'y' to continue else any other key : ");
            ch = s.next().charAt(0);
        } while(ch == 'y' || ch == 'Y' ) ;

    }

}
