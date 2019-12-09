package com.company.practical1;

import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 =s.nextInt();

        //Ternary or conditional operator
        int max = (num1 > num2) && (num1 > num3) ? num1 : ((num2 > num3) ? num2 : num3);

        //The Java.lang.math.max() function is an inbuilt
        //function in Java which returns maximum of two numbers.

        //max = Math.max(num1 , Math.max(num2 , num3));

        System.out.println("Maximum of " + num1 + "," + num2 + " and " +
                            num3 + " is : " + max);

    }

}
