package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.vetias.java.workshop.collections.Square;

public class SquareTest {
    @Test
    public void testFindSquare() {
        Square square = (int x) -> x * x; // Using a lambda expression for the Square class
        
        Assertions.assertEquals(36, square.findSquare(6));
    }
}

