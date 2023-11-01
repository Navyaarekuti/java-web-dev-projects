package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {
    private final String question;
    private final HashMap<Integer,Choice>choiceMap = new HashMap<>();
    private int maxResponses = 1;
    public Question(String question, Choice[] choiceArray)
    {
        this.question= question;
        createRandomizedChoiceMap(choiceArray);
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    public int getMaxResponses() {
        return maxResponses;
    }

    public void setMaxResponses(int maxResponses) {
        this.maxResponses = maxResponses;
    }
    public abstract String toString();
    //todo: this methods explains how it takes an array of choices named "choiceArray" and takes an arraylist(choiceList) and add elements
    //todo: the choiceArray to choiceList and shuffles and puts it into HashMap(choiceMap)

    void createRandomizedChoiceMap(Choice[] choiceArray)
    {
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList,choiceArray);
        Collections.shuffle(choiceList);
        for(int i=0;i<choiceList.size();i++)
        {
            choiceMap.put(i+1,choiceList.get(i));
        }

    }
    //todo: This method takes the key values of HashMap(choice Map) and returns a string
    String getFormattedChoice(){
        StringBuilder formattedChoice = new StringBuilder();
        String newline = System.lineSeparator();
        for(int choiceNum:choiceMap.keySet())
        {
            String choice = "\t"+choiceNum+ "_" + choiceMap.get(choiceNum).getContent()+newline;
            formattedChoice.append(choice);
        }
        return formattedChoice.toString();
    }
    //todo: takes strings tries to convert to integer if not return true and checks condition if not return true or false based on that.
public boolean isValid(String resp)
{
    try{
        int respInt = Integer.parseInt(resp);
        return respInt<=0 || respInt>choiceMap.size();
    }
    catch(NumberFormatException e)
    {
        return true;
    }
}
}
