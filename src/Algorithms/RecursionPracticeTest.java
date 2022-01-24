package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionPracticeTest {

    @Test
    void fibonaci() {
        assertEquals(832040,RecursionPractice.fibonaci(30));
    }

    @Test
    void sumOfDigits() {
        assertEquals(18,RecursionPractice.sumOfDigits(1386));
    }

    @Test
    void powPositiveNumber() {
        assertEquals(256,RecursionPractice.powPositiveNumber(2,8));
    }

    @Test
    void decimalToBinary() {
        assertEquals("11111101",RecursionPractice.decimalToBinary(253,""));
    }

    @Test
    void factorial() {
        assertEquals(24,RecursionPractice.factorial(4));
    }

    @Test
    void recursiveRange() {
        assertEquals(15,RecursionPractice.recursiveRange(5));
    }

    @Test
    void reverse() {
        assertEquals("ANKA",RecursionPractice.reverse("AKNA"));
    }

    @Test
    void isPalindrom() {
        assertTrue(RecursionPractice.isPalindrom("KAJAK"));
    }
}