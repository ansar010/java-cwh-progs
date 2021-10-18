package com.ansar.cwh.c5_practice_set;

import java.util.Scanner;

public class PS5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Problem1
//        printPattern();

        //problem2
//        sumNEvenNumbers(scanner);

        //problem3
//        multiplicationTableOfGiven_N_Numbers(scanner);

        //Problem4
//        multiplicationTableOf10InReverseOrder();

        //Problem5
//        findFactorialOfGivenNumber(scanner);

        //Problem6
//        findFactorialOfGivenNumberUsingWhileLoop(scanner);

        //Problem7
//        printPatternUsingWhileLoop();

        //Problem8
        //true

        //Problem9
//        sumOftheNumberOccuringInMultiplicationOfTable();

        //Problem10
        //do while loop executes at-least once.

        //Problem11
        sumEvenNumberUsingForLoop(scanner);

        scanner.close();
    }

    /**
     * Program to sum first n even numbers using for loop
     *
     * @param scanner
     */
    private static void sumEvenNumberUsingForLoop(Scanner scanner) {
        System.out.println("Enter n value");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of Even numbers: " + sum);
    }

    /**
     * 'Program to print the sum of the numbers occur in multiplication table of 8
     */
    private static void sumOftheNumberOccuringInMultiplicationOfTable() {
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += i * 8;
        }
        System.out.println("sum of number occurs in 8 table: " + sum);
    }

    /**
     * this method prints below pattern using while loop
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */
    private static void printPatternUsingWhileLoop() {
        int i, j, n;
        i = 0;
        n = 5;
        while (i < n) {
            j = 0;
            while (j < n - i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    /**
     * Program to find factorial of a given number using for while loop
     *
     * @param scanner
     */
    private static void findFactorialOfGivenNumberUsingWhileLoop(Scanner scanner) {
        System.out.println("Enter n value to find factorial");
        int n = scanner.nextInt();
        int factorialOfN = 1;
        int i = n;
        while (i >= 1) {
            factorialOfN *= i;
            i--;
        }
        System.out.println(factorialOfN);
    }

    /**
     * Program to find factorial of a given number using for loop
     *
     * @param scanner
     */
    private static void findFactorialOfGivenNumber(Scanner scanner) {
        System.out.println("Enter n value to find factorial");
        int n = scanner.nextInt();
        int factorialOfN = 1;
        for (int i = n; i >= 1; i--) {
            factorialOfN *= i;
        }
        System.out.println(factorialOfN);
    }

    /**
     * Program to print multiplication table of 10 in reverse order.
     */
    private static void multiplicationTableOf10InReverseOrder() {
        for (int i = 12; i >= 1; i--) {
            System.out.println(10 + " * " + i + " = " + (10 * i));
        }
    }

    /**
     * Program to print multiplication of given n numbers
     *
     * @param scanner
     */
    private static void multiplicationTableOfGiven_N_Numbers(Scanner scanner) {
        System.out.println("Enter the n value");
        int n = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    /**
     * Sum first n even numbers using while loop
     *
     * @param scanner
     */
    private static void sumNEvenNumbers(Scanner scanner) {
        System.out.println("Enter n value");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers: " + sum);
    }


    /**
     * this method prints below pattern
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */
    private static void printPattern() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
