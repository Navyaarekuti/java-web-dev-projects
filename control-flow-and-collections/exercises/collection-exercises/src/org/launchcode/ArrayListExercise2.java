import java.util.ArrayList;

public class ArrayListExercise2 {

    public static void printWordsWithFiveLetters(ArrayList<String> words1) {
        for (String word : words1) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
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

        // Call the method to print words with exactly 5 letters
        printWordsWithFiveLetters(words);
    }
}
