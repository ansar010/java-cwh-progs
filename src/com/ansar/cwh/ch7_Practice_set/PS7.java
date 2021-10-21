package com.ansar.cwh.ch7_Practice_set;

public class PS7 {
    public static void main(String[] args) {
        //Problem1
//        multiplicationTable(5);

        //Problem2
//        printPattern(4);

        //Problem3
//        int n = sumOfFirstN(3);
//        System.out.println("Sum of " + 5 + " is : " + n);

        //Problem4
//        printPatternInReverse(4);

        //Problem5
        // 0 1 1 2 3 5 8
//        int nthTerm = printNthTermOfFibonacciSeries(6);
//        System.out.println(nthTerm);

        //Problem6
//        double result = findAveOfSetOfNum(40.5, 50.5, 10.0);
//        System.out.printf("Average: %.2f" , result);

        //Probelem7
//        reversePatternUsingRecursion(4);

        //Problem8
//        printPatternRec(5);

        //Problem9
//        double farenheit = celsiusToFahrenheit(13);
//        System.out.println(farenheit);

        //Problem10
        sumOfFirstN_UsingIterativeApp(5);
    }

    /**
     * Method to print sum of n natural number using iterative approach
     *
     * @param n
     */
    private static void sumOfFirstN_UsingIterativeApp(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("sum of %d is %d", n, sum);
    }

    /**
     * Method to convert celsius into fahrenheit
     *
     * @param celsius
     * @return
     */
    private static double celsiusToFahrenheit(double celsius) {
        //formula
        //T(oF)   =  (T(oC)   ×  (9/5)) + 32
        return ((celsius * 9) / 5) + 32;
    }

    /**
     * Method to print below pattern using recursion
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param n
     */
    private static void printPatternRec(int n) {
        if (n > 0) {
            printPatternRec(n - 1);// n = 4 3 2 1.. 1 2 3 4

            for (int i = 0; i < n - 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Method to print below pattern using recursion
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param n
     */
    private static void reversePatternUsingRecursion(int n) {
        if (n > 0) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print("* ");
            }
            System.out.println();
            reversePatternUsingRecursion(n - 1);
        }
    }

    /**
     * find Averaga of set of numbers passed as var args
     *
     * @param numbers
     * @return
     */
    private static double findAveOfSetOfNum(double... numbers) {
        double sum = 0;
        for (double element : numbers) {
            sum += element;
        }
        return sum / numbers.length;
    }

    // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    private static int printNthTermOfFibonacciSeries(int n) {
        //cwh logic
         /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
//        if (n == 1 || n == 2) {
//            return n - 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }

        if (n <= 1) {
            return n;
        }
        return printNthTermOfFibonacciSeries(n - 1) + printNthTermOfFibonacciSeries(n - 2);
    }

    /**
     * Method to print below pattern
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param n
     */
    private static void printPatternInReverse(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Recursive method to calculate sum of n natural numbers
     *
     * @param n
     */
    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    private static int sumOfFirstN(int n) {
        if (n == 1) {
            return n;
        }
        return n + sumOfFirstN(n - 1);
    }

    /**
     * Method to print below pattern
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param n
     */
    private static void printPattern(int n) {
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Program to print multiplication table of number n
     *
     * @param n
     */
    private static void multiplicationTable(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
}
