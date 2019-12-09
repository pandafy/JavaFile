package com.company.practical1;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n = s.nextInt();

        //Fibonacci Series is a series of numbers in
        //which each number (Fibonacci number) is
        //the sum of the two preceding numbers.

        System.out.println("Fibonacci Series is :");
        fibo(n);

    }

    public static void fibo(int n) {

        int f = 0;  //first number (zeroth term of fibonacci series)
        int s = 1;  //second number (first term of fibonacci series)
        for (int i = 0; i <= n; i++) {

            System.out.print(f + " ");
            int temp = f + s;
            f = s;
            s = temp;

        }

    }

}
