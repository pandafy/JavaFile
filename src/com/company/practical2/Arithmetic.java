package com.company.practical2;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) throws ArithmeticException {

        //Arithmetic Exception is thrown when an exceptional arithmetic condition occurs.
        //For example, an integer "divide by zero"

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        //Menu for user to select the operation to be performed on the given numbers

        System.out.println("Arithmetical Operations");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        char ch;
        do {

            System.out.print("Enter your choice : ");
            int n = s.nextInt();
            switch(n) {
                case 1:
                    System.out.println("Addition of " + num1 + " and " + num2 +
                            " is : " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Subtraction of " + num1 + " and " + num2 +
                            " is : " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Multiplication of " + num1 + " and " + num2 +
                            " is : " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Division of " + num1 + " and " + num2 +
                            " is : " + (num1 / num2));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.print("Press 'y' to continue else any other key : ");
            ch = s.next().charAt(0);

        } while(ch == 'y' || ch == 'Y' ) ;

    }

}
