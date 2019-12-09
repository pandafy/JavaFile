package com.company.practical1;

import java.util.Scanner;

public class UptoNPrime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number upto which prime numbers are obtained : ");
        int n = s.nextInt();
        System.out.println("Prime numbers less than or equal to " + n + " are :");

        //Sieve of Eratosthenes
        //A value in prime[i] will be false if it is Not a prime, else true.

        boolean[] prime = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if(prime[p]) {

                // Update all multiples of p
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        //Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if(prime[i]) {
                System.out.print(i + " ");
            }
        }

    }

}
