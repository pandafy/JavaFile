package com.company.practical2;

public class StaticUsage {

    //NonStatic counter

    private int count = 0;

    //Static counter

    private static int statCount = 0;

    public StaticUsage() {

        count++;
        statCount ++;
        System.out.println("Int Counter = " + count + " and Static Int Counter = " + statCount);

    }

}

class Test {

    static int i;

    //Static Block

    static {

        i = 10;
        System.out.println("Static block invoked");

    }

    //Constructor

    Test(){

        System.out.println("Constructor invoked");

    }

}

class Main {

    public static void main(String[] args) {

        System.out.println("'Use of Static Member'");
        StaticUsage static1 = new StaticUsage();
        StaticUsage static2 = new StaticUsage();

        System.out.println("\n'Use of Static Block'");

        //The code inside static block is executed only once:
        // the first time you make an object of that class or
        // the first time you access a static member
        // of that class (even if you never make an object of that class)

        System.out.println("i = " + Test.i);

        //Although we have two objects, static block is executed only once

        Test test1 = new Test();
        Test test2 = new Test();

    }

}
