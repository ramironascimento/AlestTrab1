package com.company.Tests;

import com.company.StopWords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class StopWordsTest {
    @Test
    void loadList() {
        StopWords.loadList();
        Assertions.assertFalse(StopWords.getStopWordsList().isEmpty());
    }


    @org.junit.jupiter.api.Test
    void isAStopWord(){
        StopWords.loadList();

        // testing words that exists everywhere in the list with lower and upper case
        Assertions.assertTrue(StopWords.isAStopWord("a"),"String \"a\" is a stop word ");
        Assertions.assertTrue(StopWords.isAStopWord("has"),"String \"has\" is a stop word ");
        Assertions.assertTrue(StopWords.isAStopWord("THIRD"),"String \"THIRD\" is, also, a stop word ");
        Assertions.assertTrue(StopWords.isAStopWord("A"),"String \"A\" is, also, a stop word ");

        // testing a non stopword
        Assertions.assertFalse(StopWords.isAStopWord("abc"),"String \"abc\" is not a stop word ");

    }
}