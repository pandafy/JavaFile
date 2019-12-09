package com.company.practical3;

public abstract class Employee {

    public String name;
    public float salary;
    public float gross_sal;

    public Employee(String name, float salary) {
        this.name=name;
        this.salary=salary;
    }

    void print() {

        System.out.println("Employee name : " + name +
                "\nEmployee salary : " + salary +
                "\nEmployee gross salary : " + gross_sal);

    }

    abstract void calculateGrossSalary();
    abstract void annualIncrement();

}

class Manager extends Employee {

    public float hra;
    Manager(String name, float salary) {
        super(name, salary);
    }

    @Override
    void calculateGrossSalary() {
        gross_sal=(salary+hra)/12;
        super.print();
    }

    @Override
    void annualIncrement() {
        hra+=0.05*salary;
    }
}
class SalesManager extends Manager {

    private float commission;

    SalesManager(String name, float salary) {
        super(name, salary);
    }

    @Override
    void calculateGrossSalary() {
        gross_sal=(salary+hra+commission)/12;
        super.print();
    }

    @Override
    void annualIncrement() {
        hra+=0.05*salary;
        commission+=0.01*salary;
    }

}

class Client {

    public static void main(String[] args) {

        Manager manager = new Manager("Alia",85000);
        manager.annualIncrement();
        manager.calculateGrossSalary();
        System.out.println();

        SalesManager salesManager = new SalesManager("Sana",50000);
        salesManager.annualIncrement();
        salesManager.calculateGrossSalary();

    }

}
