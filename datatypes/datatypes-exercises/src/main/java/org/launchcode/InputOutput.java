package org.launchcode;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, What is your name!!");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
