package com.company.practical1;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = s.nextInt();
        int nvl = 1;
        int nsp = n-1;

        for (int row = 1; row <=  n; row++) {

            int val = 1;

            //prints spaces
            for (int sp = 1; sp <= nsp; sp++) {

                System.out.print("\t");

            }

            //prints values
            for (int vl = 1; vl <= nvl; vl++) {

                System.out.print(val + "\t");

                //condition of incrementing and
                //decrementing the values to be printed

                if(vl <= nvl/2) {
                    val++;
                } else {
                    val--;
                }
            }

            nvl += 2;
            nsp--;
            System.out.println();

        }

    }

}
