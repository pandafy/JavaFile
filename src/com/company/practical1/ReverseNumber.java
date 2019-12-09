package com.company.practical1;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();
        System.out.println("Reverse of " + num + " is : " + reverse(num));

    }

    public static int reverse(int n) {

        //Reversing the digits of the number

        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;

    }

}
