package com.company.practical4;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = s.nextInt();
        System.out.println("Enter the elements : ");
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {

            nums[i] = s.nextInt();

        }

        try {

            System.out.println("Inside try block");
            System.out.print("Enter the array index : ");
            n = s.nextInt();  //index
            System.out.println("Element at index " + n + " = " + nums[n]);

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception caught in catch block");
            System.out.println(e);

        } finally {

            System.out.println("finally block executed");

        }

        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");

    }

}
