package com.company.practical3;

public class Dispatch {

    public void message() {

        System.out.println("Inside Dipatch's message method");

    }

}

class Main extends Dispatch{

    @Override
    public void message() {

        System.out.println("Inside Main's message method");

    }

}

class TestDispatch {

    public static void main(String[] args) {

        Dispatch dispatch = new Dispatch();
        Main main = new Main();

        Dispatch ref;
        ref = dispatch;
        ref.message();

        ref = main;
        ref.message();

    }

}
