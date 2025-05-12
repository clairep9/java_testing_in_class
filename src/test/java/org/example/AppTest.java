package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    @Test
    public void testSumOfDigits() {
        assertEquals(0, Algorithms.sumOfDigits(0));
        assertEquals(1, Algorithms.sumOfDigits(1));
        assertEquals(9, Algorithms.sumOfDigits(9));
        assertEquals(10, Algorithms.sumOfDigits(19));
        assertEquals(15, Algorithms.sumOfDigits(12345));
        assertEquals(45, Algorithms.sumOfDigits(99999));
    }

    @Test
    public void testCountPrimes() {
        assertEquals(0, Algorithms.countPrimes(1));
        assertEquals(1, Algorithms.countPrimes(2));
        assertEquals(2, Algorithms.countPrimes(3));
        assertEquals(4, Algorithms.countPrimes(10));
        assertEquals(8, Algorithms.countPrimes(20));
        assertEquals(25, Algorithms.countPrimes(100));
    }

    @Test
    public void testSqrt() {
        assertEquals(0.0, Algorithms.sqrt(0, 10), 0.0001);
        assertEquals(1.0, Algorithms.sqrt(1, 10), 0.0001);
        assertEquals(2.0, Algorithms.sqrt(4, 10), 0.0001);
        assertEquals(3.0, Algorithms.sqrt(9, 10), 0.0001);
        assertEquals(4.0, Algorithms.sqrt(16, 10), 0.0001);
        assertEquals(5.0, Algorithms.sqrt(25, 10), 0.0001);
    }

    @Test
    public void testIsPowerOfTwo() {
        assertFalse(Algorithms.isPowerOfTwo(0));
        assertTrue(Algorithms.isPowerOfTwo(1));
        assertTrue(Algorithms.isPowerOfTwo(2));
        assertTrue(Algorithms.isPowerOfTwo(4));
        assertTrue(Algorithms.isPowerOfTwo(8));
        assertTrue(Algorithms.isPowerOfTwo(16));
        assertFalse(Algorithms.isPowerOfTwo(3));
        assertFalse(Algorithms.isPowerOfTwo(5));
        assertFalse(Algorithms.isPowerOfTwo(6));
        assertFalse(Algorithms.isPowerOfTwo(7));
    }

    @Test
    public void testIsValidTriangle() {
        assertFalse(Algorithms.isValidTriangle(0, 1, 1));
        assertFalse(Algorithms.isValidTriangle(1, 0, 1));
        assertFalse(Algorithms.isValidTriangle(1, 1, 0));
        assertFalse(Algorithms.isValidTriangle(-1, 1, 1));
        assertTrue(Algorithms.isValidTriangle(3, 4, 5));
        assertTrue(Algorithms.isValidTriangle(5, 5, 5));
        assertFalse(Algorithms.isValidTriangle(1, 2, 4));
        assertFalse(Algorithms.isValidTriangle(2, 3, 6));
    }

    @Test
    public void testReverseString() {
        assertEquals("", Algorithms.reverseString(""));
        assertEquals("a", Algorithms.reverseString("a"));
        assertEquals("ba", Algorithms.reverseString("ab"));
        assertEquals("cba", Algorithms.reverseString("abc"));
        assertEquals("racecar", Algorithms.reverseString("racecar"));
        assertEquals("!dlroW olleH", Algorithms.reverseString("Hello World!"));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(0, Algorithms.countOccurrences("", 'a'));
        assertEquals(0, Algorithms.countOccurrences("hello", 'a'));
        assertEquals(1, Algorithms.countOccurrences("hello", 'h'));
        assertEquals(2, Algorithms.countOccurrences("hello", 'l'));
        assertEquals(3, Algorithms.countOccurrences("hello world", 'l'));
        assertEquals(1, Algorithms.countOccurrences("hello", 'o'));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(Algorithms.isPalindrome(""));
        assertTrue(Algorithms.isPalindrome("a"));
        assertTrue(Algorithms.isPalindrome("aa"));
        assertTrue(Algorithms.isPalindrome("aba"));
        assertTrue(Algorithms.isPalindrome("racecar"));
        assertTrue(Algorithms.isPalindrome("madam"));
        assertFalse(Algorithms.isPalindrome("hello"));
        assertFalse(Algorithms.isPalindrome("world"));
    }

    @Test
    public void testFindMax() {
        assertEquals(5, Algorithms.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, Algorithms.findMax(new int[]{1}));
        assertEquals(0, Algorithms.findMax(new int[]{-5, -3, -1, 0}));
        assertEquals(100, Algorithms.findMax(new int[]{100, 50, 75}));
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(3.0, Algorithms.calculateAverage(new int[]{1, 2, 3, 4, 5}), 0.0001);
        assertEquals(1.0, Algorithms.calculateAverage(new int[]{1}), 0.0001);
        assertEquals(0.0, Algorithms.calculateAverage(new int[]{-2, -1, 0, 1, 2}), 0.0001);
        assertEquals(50.0, Algorithms.calculateAverage(new int[]{0, 50, 100}), 0.0001);
    }

    @Test
    public void testIsSorted() {
        assertTrue(Algorithms.isSorted(new int[]{1, 2, 3, 4, 5}));
        assertTrue(Algorithms.isSorted(new int[]{1}));
        assertTrue(Algorithms.isSorted(new int[]{1, 1, 1, 1}));
        assertTrue(Algorithms.isSorted(new int[]{-5, -3, -1, 0}));
        assertFalse(Algorithms.isSorted(new int[]{5, 4, 3, 2, 1}));
        assertFalse(Algorithms.isSorted(new int[]{1, 3, 2, 4, 5}));
    }
}
