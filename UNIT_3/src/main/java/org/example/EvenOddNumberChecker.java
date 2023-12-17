package org.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse; 

public class EvenOddNumberChecker {

    public boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }

    @Test
    public void testEvenNumber() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        assertTrue(checker.evenOddNumber(2));
    }

    @Test
    public void testOddNumber() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        assertFalse(checker.evenOddNumber(3));
    }

    @Test
    public void testZero() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        assertTrue(checker.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        assertTrue(checker.evenOddNumber(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        EvenOddNumberChecker checker = new EvenOddNumberChecker();
        assertFalse(checker.evenOddNumber(-7));
    }
}
