package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBonusExercise {

    public static void exactFive(ArrayList<String> word, int length)
    {
//        for(String str: word)
//        {
//            //System.out.println(str);
//            if(str.length()==4)
//            {
//                System.out.println(str);
//            }
//        }
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        words.add("pers");
        words.add("gtrhy");
        words.add("oets");
        words.add("ploiju");
        words.add("pouy");

        //System.out.println(words);
        System.out.println("Enter the length");
        int lens = sc.nextInt();
        exactFive(words,lens);

    }

//    public static int sumOfEven(ArrayList<Integer> allnums)
//    {
//        int sum=0;
//        for(int i:allnums) {
//            System.out.println(i);
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(4);
//        nums.add(9);
//        nums.add(1);
//        System.out.println(nums);
//        //int evenSum;
//        int evenSum = sumOfEven(nums);
//        System.out.println("sum of even " +evenSum);
//    }

//    public static void printWordsWithLength(ArrayList<String> wordList, int length) {
//        for (String word : wordList) {
//            if (word.length() == length) {
//                System.out.println(word);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a sentence: ");
//        String inputSentence = scanner.nextLine();
//
//        System.out.print("Enter the word length to search for: ");
//        int searchLength = scanner.nextInt();
//
//        // Split the input sentence into words and store them in an ArrayList
//        ArrayList<String> words = new ArrayList<>();
//        String[] wordArray = inputSentence.split("\\s+"); // Split by whitespace
//        for (String word : wordArray) {
//            words.add(word);
//        }
//
//        // Call the method to print words with the specified length
//        printWordsWithLength(words, searchLength);
//
//        scanner.close();
//    }
}



