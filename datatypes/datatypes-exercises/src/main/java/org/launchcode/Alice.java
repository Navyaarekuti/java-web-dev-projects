package org.launchcode;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        {
//            String s1 = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
//            String s2= s1.toLowerCase();
//            System.out.println(s2);
//            System.out.println("enter searchterm");
//            String searchTerm;
//            searchTerm = sc.nextLine();
//            if(s2.contains(searchTerm))
//            {
//                System.out.println("true");
//            }
//            else
//            {
//                System.out.println("false");
//            }
//        }


        Scanner sc = new Scanner(System.in);
        String s1 = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String[] s2 = s1.toLowerCase().split(" ", 0);
        String s3;
        //System.out.println(s2);
        for (String x : s2) {
            System.out.println(x);

        }
        System.out.println("Enter s3");
        s3 = sc.nextLine().toLowerCase();
        boolean containsS3 = false;
        for (String x : s2) {
            if (x.equals(s3)) {
                //containsS3 = true;
                //break; // No need to continue searching once a match is found
                System.out.println("true");
            }
        }

//        if (containsS3) {
//            System.out.println("s1 contains s3");
//        } else {
//            System.out.println("s1 does not contain s3");
//        }
    }
}

