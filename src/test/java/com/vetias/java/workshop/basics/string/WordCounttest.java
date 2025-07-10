package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Test;

import com.vetias.java.workshop.basics.WordCount;

import org.junit.jupiter.api.Assertions;

public class WordCounttest {
    @Test
    public void testWordCount(){
        WordCount wordcount= new WordCount();
        int count = wordcount.count("This is a java program to test the word count functionality in java");
        Assertions.assertEquals(13,count);
    }

    @Test
    public void testAnotherString(){
        WordCount wordcount= new WordCount();
        int count = wordcount.count("This is another test string");
        Assertions.assertEquals(5,count);
    }
}
