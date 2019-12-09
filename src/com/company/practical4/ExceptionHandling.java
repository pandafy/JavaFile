package com.company.practical4;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the two numbers for division : ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        try {

            //May throw exception
            int res = num1 / num2;
            System.out.println("Result = " + res);

        }

        //Handling the exception
        catch(ArithmeticException e) {

            System.out.println(e);

        }

    }

}
