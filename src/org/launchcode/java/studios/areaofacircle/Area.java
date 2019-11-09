package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        double r;
        double pi;
        Scanner input;

        pi = 3.14;

        input = new Scanner(System.in);
        System.out.println("What is the circle's raduis?");
        r = input.nextInt();
        input.close();
        double A = Circle.getArea(r);

        System.out.println("The area of a circle with a radius of " + r + " is " + (A));
    }
}
