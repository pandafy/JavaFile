package com.company.practical4;

import java.util.Scanner;

public class MultipleCatch {

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

            System.out.println("1 : For Division\n2 : Print element");
            System.out.print("Enter your choice : ");
            int ch = s.nextInt();
            switch (ch) {

                case 1:
                    System.out.print("Enter the array index and divisor : ");
                    n = s.nextInt();  //index
                    ch = s.nextInt();  //divisor
                    System.out.println("Division of " + nums[n] +
                            " and " + ch + " = " + (nums[n]/ch));
                    break;

                case 2:
                    System.out.print("Enter the array index : ");
                    n = s.nextInt();  //index
                    System.out.println("Element at index " + n + " = " + nums[n]);
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } catch(ArithmeticException e) {

            System.out.println("Arithmetic Exception occurs");

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBounds Exception occurs");

        }

    }

}
