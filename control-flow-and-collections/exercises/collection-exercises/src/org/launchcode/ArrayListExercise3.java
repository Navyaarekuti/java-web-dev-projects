package org.launchcode;

import java.util.ArrayList;
import java.util.*;
public class ArrayListExercise3 {

        public static void printWordsWithLength(ArrayList<String> wordList, int length) {
            for (String word : wordList) {
                if (word.length() == length) {
                    System.out.println(word);
                }

            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create an ArrayList of words
            ArrayList<String> words = new ArrayList<>();
            words.add("apple");
            words.add("banana");
            words.add("cherry");
            words.add("grape");
            words.add("kiwi");
            words.add("lemon");
            words.add("melon");
            words.add("orange");
            words.add("peach");
            words.add("pear");

            System.out.print("Enter the word length to search for: ");
            int searchLength = scanner.nextInt();

            // Call the method to print words with the specified length
            printWordsWithLength(words, searchLength);

            scanner.close();
        }
    }

