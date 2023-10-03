import org.launchcode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingcharBonus {
    public static void main(String[] args) {
        HashMap<Character,Integer> countLowercase = new HashMap<>();
        //String str = "Geeks for Geeks is a good portal for all computer and geek students";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count characters even in lowercase: ");
        String str = sc.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chararr = str.toUpperCase().toCharArray();
        //System.out.println(Arrays.toString(chararr));
        for(char ele:chararr)
        {
            //System.out.println(alphabet.indexOf(ele));
            if(alphabet.indexOf(ele) >= 0)
           // System.out.println(ele);
            if(countLowercase.containsKey(ele))
            {
                countLowercase.put(ele,countLowercase.get(ele)+1);
            }
            else
                countLowercase.put(ele,1);
        }

        for(Map.Entry actualcount:countLowercase.entrySet())
        {
            System.out.println(actualcount.getKey() + "; " + actualcount.getValue());
        }



    }
}
