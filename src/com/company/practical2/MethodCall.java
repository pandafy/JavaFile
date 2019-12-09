package com.company.practical2;

public class MethodCall {

    private int data = 10;

    //Call by Value

    private void changeValue(int data) {
        data += 100;
    }

    //Call by Reference

    private void changeReference(MethodCall method) {
        method.data += 100;
    }

    public static void main(String[] args) {

        MethodCall method = new MethodCall();
        System.out.println("Before Change : " + method.data);
        method.changeValue(50);
        System.out.println("After call by Value : " + method.data);
        method.changeReference(method);
        System.out.println("After call by reference : " + method.data);

    }
}
