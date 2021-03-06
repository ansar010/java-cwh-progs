package com.ansar.cwh.exercises;

/**
 * Program to sum factorial of a number using recurstion.
 */
public class FactorialOfNumber {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is : " + result);
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
