package com.company.practical3;

public interface InterfaceF1 {

    public void myMethod();

}

interface InterfaceF2 {

    public void myMethod();

}

class Test implements InterfaceF1,InterfaceF2 {

    @Override
    public void myMethod() {

        System.out.println("Implementing more than one interfaces");

    }

    public static void main(String[] args) {

        Test obj = new Test();
        obj.myMethod();

    }

}
