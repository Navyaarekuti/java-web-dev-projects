package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {

        //Collections
        int[] arr = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
       // String[] words = phrase.split("\\.");
        String[] words = phrase.split(" ",0);
        System.out.println(Arrays.toString(words));


    }
}
