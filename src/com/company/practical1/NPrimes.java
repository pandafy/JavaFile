package com.company.practical1;

import java.util.Scanner;

public class NPrimes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n = s.nextInt();
        System.out.println("The first " + n + " prime numbers are :");
        int num = 2;
        for (int i = 0; i < n ;) {

            if(isPrime(num)) {
                System.out.print(num + " ");
                i++;
                num++;
            } else {
                num++;
            }

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
