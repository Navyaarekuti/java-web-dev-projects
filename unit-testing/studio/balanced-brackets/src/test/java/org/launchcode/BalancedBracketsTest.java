package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest()
    {
        String msg = "empty";
        assertEquals(true, true, msg);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        String msg = "a single set of balanced brackects";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void singleBracketBeforeCharacter() {
        String msg = "bracket infront of other character returns true";
        String testData = "[]Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,msg);
    }
    @Test
    public void singleBracketAfterEachCharacter(){
        String msg = "bracket after of other character returns true";
        String testData = "[Launchcode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,msg);

    }
    @Test
    public void singleBracketInBetweenEachCharacter(){
        String msg = "bracket after of other character returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,msg);

    }
    @Test
    public void tripleBrackets(){
        String msg = "contains triple bracket";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,msg);

    }
    @Test
    public void nestedTripleBrackets(){
        String msg = "contains nested triple bracket";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,msg);

    }
    @Test
    public void singleOpeningBracket() {
        String message = "a single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleClosingBracket() {
        String message = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void reversedBrackets() {
        String message = "a reversed sets of brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketWithOtherCharacters() {
        String message = "a single opening bracket with other characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void unbalancedBracketsAmongOtherCharacters() {
        String message = "unbalanced brackets among other characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void mixOfUnbalancedBrackets() {
        String message = "a mix of unbalanced brackets returns false";
        String testData = "[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }


    // EDGE CASES

    @Test
    public void stringOfCharactersWithoutBrackets() {
        String message = "a string of characters without brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void emptyString() {
        String message = "an empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

}