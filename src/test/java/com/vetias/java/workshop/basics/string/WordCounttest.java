package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WordCounttest {
    @Test
    public void testWordCount(){
        WordCount wordcount= new WordCount();
        int count = wordcount.count("This is a java program to test the word count functionality in java");
        Assertions.assertEquals(12,count);
    }
}
