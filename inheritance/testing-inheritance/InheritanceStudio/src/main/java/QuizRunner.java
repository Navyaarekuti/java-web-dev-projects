import Questions.*;

public class QuizRunner {

    // Create quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        // Create questions

        String q1 = "Which of the following are courses of CSE?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Physics"),
                new Choice("Computer Engineering", true),
                new Choice("Chemistry"),
                new Choice("DBMS", true)
        };
        CheckBox question1 = new CheckBox(q1, q1Choices);

        String q2 = "The most-published book of all time is Java.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "Which poem did history-making poet Amanda Gorman recite at the U.S. presidential inauguration in 2021?";
        Choice[] q3Choices = new Choice[] {
                new Choice("The Hill We Climb", true),
                new Choice("The Miracle of Morning"),
                new Choice("We Rise"),
                new Choice("New Day's Lyric")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);


        // Add questions to quiz

        quiz.addQuestions(new Question[] { question1, question2, question3 });


        // Interact with user (run quiz, give score)

        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);

    }

}