package org.launchcode;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        {
            System.out.println("Enter the length of rectangle");
            int length = sc.nextInt();
            System.out.println("Enter the breadth of rectangle");
            int breadth = sc.nextInt();
            int result;
            result = 2*length*breadth;
            System.out.println("The area of rectangle is: " + result);
        }
    }
}
