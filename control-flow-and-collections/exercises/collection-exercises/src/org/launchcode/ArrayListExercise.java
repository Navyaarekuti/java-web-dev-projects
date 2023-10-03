package org.launchcode;


import java.util.ArrayList;

public class ArrayListExercise {
    public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
            int sum = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    sum += number;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            // Create an ArrayList with at least 10 integers
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(2);
            numbers.add(5);
            numbers.add(8);
            numbers.add(10);
            numbers.add(7);
            numbers.add(14);
            numbers.add(6);
            numbers.add(3);
            numbers.add(12);
            numbers.add(10);

            // Call the method to find the sum of even numbers
            int evenSum1 = sumOfEvenNumbers(numbers);

            // Display the result
            System.out.println("Sum of even numbers: " + evenSum1);
        }
    }



