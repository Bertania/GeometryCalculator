package edu.cvtc.java;

/*
    Author: Sebestyen Bandoli
*/

import java.util.Scanner;

public class GeometryCalculator {

    public static void main(String[] args) {
        int choice; // The user's selection from menu

        // User's menu choice
        do {
            choice = getMenu();

            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }
            } while (choice != 4);
        }

        public static int getMenu() {

        int userChoice;

        // Create a Scanner object for keyboard input
            Scanner keyboard = new Scanner(System.in);

            // Display the menu
            System.out.println("Geometry Calculator\n");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit\n");
            System.out.println("Enter your choice (1-4) : ");

            // Get input from the user
            userChoice = keyboard.nextInt();

            // Validate user input
            while (userChoice < 1 || userChoice > 4) {
                System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
                userChoice = keyboard.nextInt();
            }

            return userChoice;
        }

    public static void calculateCircleArea() {

        double radius;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the circle's radius? ");
        radius = keyboard.nextDouble();

        // loop for validating user input
        while (radius < 1) {
            System.out.println("Invalid number.  Please enter a positive number.");
            radius = keyboard.nextInt();
        }

        // Display circle's area
        System.out.println("The circle's area is "
                + Geometry.areaOfCircle(radius));
    }

    public static void calculateRectangleArea() {
        double length;
        double width;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get length from user
        System.out.print("Enter the length: ");
        length = keyboard.nextDouble();

        // Get width from user
        System.out.print("Enter the width: ");
        width = keyboard.nextDouble();

        // loop for validating user input
        while (length < 1 || width < 1) {
            System.out.println("Invalid number.  Please enter a positive number.");
            length = keyboard.nextInt();
            width = keyboard.nextInt();
        }

        // Display the rectangle's area
        System.out.println("The rectangle's area is "
                + Geometry.areaOfRectangle(length, width));
    }

    public static void calculateTriangleArea() {

        double base;
        double height;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get the base from user
        System.out.print("Enter length of the triangle's base: ");
        base = keyboard.nextDouble();

        // Get the height from user
        System.out.print("Enter the triangle's height: ");
        height = keyboard.nextDouble();

        // loop for validating user input
        while (base < 1 || height < 1) {
            System.out.println("Invalid number.  Please enter a positive number.");
            base = keyboard.nextInt();
            height = keyboard.nextInt();
        }

        // Display the triangle's area
        System.out.println("The triangle's area is "
                + Geometry.areaOfTriangle(base, height));
    }
}
