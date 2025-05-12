package org.example;

public class Algorithms {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] isComposite = new boolean[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                count++;

                for (int j = i * 2; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        return count;
    }

    public static double sqrt(double x, int iterations) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        if (x == 0) {
            return 0;
        }

        double guess = x / 2.0;
        for (int i = 0; i < iterations; i++) {
            guess = 0.5 * (guess + x / guess);
        }

        return guess;
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static boolean isValidTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return a + b > c && a + c > b && b + c > a;
    }

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static int countOccurrences(String str, char character) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    public static boolean isSorted(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main( String[] args )
    {


    }
}
