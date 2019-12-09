package com.company.practical1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        //The Scanner class is used to get user input,
        //and it is found in the java.util package

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        //The factorial of a positive integer n,
        //denoted by n!, is the product of all
        // positive integers less than or equal to n

        System.out.println("Factorial of " + num + " is : " + fact(num));

    }

    public static int fact(int n) {

        if(n < 2) {

            return 1;

        } else {

            return n * fact(n-1);

        }

    }

}
