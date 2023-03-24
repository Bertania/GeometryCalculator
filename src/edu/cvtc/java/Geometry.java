package edu.cvtc.java;

/*
    Author: Sebestyen Bandoli
*/

public class Geometry {

    // Methods
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfTriangle(double base, double height) {
        return base * height * 0.5;
    }

}
