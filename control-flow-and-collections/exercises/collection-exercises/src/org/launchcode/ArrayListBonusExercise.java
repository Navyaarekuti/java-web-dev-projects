package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBonusExercise {

    public static void printWordsWithLength(ArrayList<String> wordList, int length) {
        for (String word : wordList) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        System.out.print("Enter the word length to search for: ");
        int searchLength = scanner.nextInt();

        // Split the input sentence into words and store them in an ArrayList
        ArrayList<String> words = new ArrayList<>();
        String[] wordArray = inputSentence.split("\\s+"); // Split by whitespace
        for (String word : wordArray) {
            words.add(word);
        }

        // Call the method to print words with the specified length
        printWordsWithLength(words, searchLength);

        scanner.close();
    }
}



