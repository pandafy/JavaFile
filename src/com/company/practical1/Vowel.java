package com.company.practical1;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        System.out.print("Enter the character : ");

        //next() function returns the next token/word in
        //the input as a string and charAt(0) function
        //returns the first character in that string.

        char ch = s.next().charAt(0);

        switch (ch) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }

    }

}
