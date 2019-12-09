package com.company.practical4;

import java.util.Scanner;

public class Distance {

    private int distance;

    public void getdistance(){

        System.out.print("Enter the distance : ");
        Scanner s = new Scanner(System.in);
        this.distance = s.nextInt();

    }

    public Distance addDistance(Distance d){

        Distance temp = new Distance();
        temp.distance = this.distance + d.distance;
        return temp;

    }
    public void printdistance(){

        System.out.println("Distance = " + this.distance);

    }

    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance();
        d1.getdistance();
        d2.getdistance();
        d1 = d1.addDistance(d2);
        d1.printdistance();

    }

}
