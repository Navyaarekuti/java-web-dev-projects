package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("enter radius: ");
        double radius;
        radius=sc.nextDouble();
        double PI=3.14;
        double area = Circle.getArea(radius);
        System.out.println("The Area of circle is: "+area);*/

        /*System.out.println("Please enter a radius: ");

        // Validate for data type
        if (sc.hasNextDouble()) {
            double radius = sc.nextDouble();

            // Validate for positive number
            if (radius > 0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
            } else {
                System.out.println("Sorry, the radius must be a positive number.");
            }
        } else {
            System.out.println("Sorry, that was not a valid number.");
        }*/

        double radius; // declare but don't initialize yet

        do {
            System.out.println("Please enter a positive number for the radius: ");
            while (!sc.hasNextDouble()) {
                System.out.println("The radius must be a number! Try again: ");
                sc.next();
                // NOTE: input.next() allows the user to try again for this loop
                // But it will also allow the scanner to advance past this loop if valid
                // so that it can be stored in the radius variable with input.nextDouble() below

            }
            radius = sc.nextDouble();

        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");

        sc.close();
    }
}
