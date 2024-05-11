package org.finaltest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestAnagram {
    private static final String FIRST_ANAGRAM = "espada";
    private static final String SECOND_ANAGRAM = "pesada";

    private static final String SECOND_UPPER_CASE_NOT_ANAGRAM = "PESADA";

    private static final String FIRST_NOT_ANAGRAM = "banano";

    private static final String FIRST_NUMBER_NOT_ANAGRAM = "123";
    private static final String SECOND_NUMBER_NOT_ANAGRAM = "321";

    private static final String FIRST_NULL_ANAGRAM = null;

    private static final Boolean RESULT_CASE_ANAGRAM_TRUE = true;
    private static final Boolean RESULT_CASE_ANAGRAM_FALSE = false;


    @Test
    void testCaseFirstAnagram()
    {
        Anagram anagram = new Anagram(FIRST_ANAGRAM, SECOND_ANAGRAM);
        boolean result = anagram.isAnagram();
        assertEquals(RESULT_CASE_ANAGRAM_TRUE, result);
    }

    @Test
    void testCaseSecondUpperCaseNotAnagram()
    {
        Anagram anagram = new Anagram(FIRST_ANAGRAM, SECOND_UPPER_CASE_NOT_ANAGRAM);
        boolean result = anagram.isAnagram();
        assertEquals(RESULT_CASE_ANAGRAM_FALSE, result);
    }

    @Test
    void testCaseFirstNotAnagram()
    {
        Anagram anagram = new Anagram(FIRST_NOT_ANAGRAM, SECOND_ANAGRAM);
        boolean result = anagram.isAnagram();
        assertEquals(RESULT_CASE_ANAGRAM_FALSE, result);
    }

    @Test
    void testCaseFirstNullAnagram()
    {
        Anagram anagram = new Anagram(FIRST_NULL_ANAGRAM, SECOND_ANAGRAM);
        boolean result = anagram.isAnagram();
        assertEquals(RESULT_CASE_ANAGRAM_FALSE, result);
    }

    @Test
    void testCaseDifferentLengthAnagram()
    {
        Anagram anagram = new Anagram(FIRST_ANAGRAM, "p");
        boolean result = anagram.isAnagram();
        assertEquals(RESULT_CASE_ANAGRAM_FALSE, result);
    }



    @Test
    void testCaseFirstAnagramEqualWords()
    {
        Anagram anagram = new Anagram(FIRST_ANAGRAM, FIRST_ANAGRAM);
        boolean result = anagram.isAnagram();
        assertEquals(RESULT_CASE_ANAGRAM_FALSE, result);
    }

    @Test
    void testCaseFirstAnagramNumbers()
    {
        Anagram anagram = new Anagram(FIRST_NUMBER_NOT_ANAGRAM, SECOND_NUMBER_NOT_ANAGRAM);
        boolean result = anagram.isAnagram();
        assertEquals(RESULT_CASE_ANAGRAM_FALSE, result);
    }


}
