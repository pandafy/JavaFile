package com.company.practical1;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        //A prime number is a whole number greater than
        //1 whose only factors are 1 and itself

        if(isPrime(num)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

    }

    public static boolean isPrime(int n) {

        if( n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {

            if(n % i == 0) {
                return false;
            }

        }
        return true;

    }

}
