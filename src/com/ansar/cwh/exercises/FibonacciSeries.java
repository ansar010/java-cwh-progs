package com.ansar.cwh.exercises;

/**
 * Implement a program to print Fibonacci series by using recurssion.
 */
public class FibonacciSeries {
    static int pre, current, next;

    public static void main(String[] args) {
//        int n = 5;
//        pre = 0;
//        next = 0;
//        current = 1;
//        System.out.print(pre + " " + current);
//        printFibonacci(n);
        int result = nthFibonacci(5);
        System.out.println(result);
    }

    /**
     * print nth fibonacci number
     * @param n
     * @return
     */
    private static int nthFibonacci(int n) {
        if(n <= 1)
            return n;
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    private static void printFibonacci(int n) {

        if (n > 2) {
            next = pre + current;
            pre = current;
            current = next;
            System.out.print(" " + next);
            printFibonacci(n - 1);
        }
    }
}
