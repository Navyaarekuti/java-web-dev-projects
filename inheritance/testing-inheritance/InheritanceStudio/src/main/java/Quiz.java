import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import Questions.Choice;

import Questions.Question;
public class Quiz {
    private final ArrayList<Question> questions = new ArrayList<>();
    private int numCorrect = 0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Question[] QuestionArray) {
        Collections.addAll(questions, QuestionArray);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        Collections.shuffle(questions);
        //Print question for the user

        for (Question question : questions) {
            System.out.println(question);

            // Get and evaluate answers for the current question
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;

            while (i < question.getMaxResponses()) {
                String userResponse;

                do {
                    System.out.println("Please enter a number: ");
                    userResponse = sc.nextLine();
                } while (question.isValid(userResponse));

                int userRespNum = Integer.parseInt(userResponse);

                if (userResponses.contains(userRespNum)) {
                    System.out.println("You already got that one!");
                } else if (!question.getChoiceMap().get(userRespNum).isCorrect()) {
                    System.out.println("Sorry, the correct answer was: ");
                    for (Choice choice : question.getChoiceMap().values()) {
                        if (choice.isCorrect()) {
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userRespNum);
                    if (i == question.getMaxResponses() - 1) {
                        numCorrect++;
                    }
                    i++;
                }
            }
        }

        sc.close();
    }
}

