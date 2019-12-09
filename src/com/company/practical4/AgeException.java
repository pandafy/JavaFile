package com.company.practical4;

import java.util.Scanner;

public class AgeException extends Exception {

    void checkAge(int age) throws Exception {

        if (age <= 0) {

            throw new InvalidAgeException();

        } else if (age < 18) {

            throw new TooYoungException();

        }
        System.out.println("You can Vote");

    }
}

class TooYoungException extends AgeException {

    public TooYoungException() {

        System.out.println("TooYoungAgeException caught");

    }

}

class InvalidAgeException extends AgeException {

    public InvalidAgeException() {

        System.out.println("InvalidAgeException caught");

    }

}

class Test{

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the age : ");
        AgeException excp = new AgeException();
        try {

            excp.checkAge(s.nextInt());

        } catch (TooYoungException e) {

            System.out.println("You are two young to vote!");

        } catch (InvalidAgeException e) {

            System.out.println("Invalid Age");

        }

    }

}
