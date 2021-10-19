package com.ansar.cwh.ch6_Practice_set;

public class PS6 {
    public static void main(String[] args) {
        //problem1
//        sumOfFloatArray();

        //problem2
//        findGivenIntInArray(4);

        //Problem3
//        calculateTheAverageMarkOfStudents();

        //problem4
//        addTwoMatrices();

        //problem5
//        reverseArrayUsingForLoop();

//        reverseArrayUsingWhileLoop();

        //problem6
//        findMaxElementInArray();

        //Problem7
//        findMinEleInArr();

        //Problem8
        checkArrIsSortedOrNot();
    }

    /**
     * Program to check the array is sorted or not.
     */
    private static void checkArrIsSortedOrNot() {
        int[] arr = {8, 2, 3, 4, 5};
        boolean isSorted = true;
        int length = arr.length - 1;
        int i = 0;
        int startValue = arr[i];
        while (i < length) {
            if (arr[i + 1] < arr[i])
                isSorted = false;
            i++;
        }
        if (isSorted) {
            System.out.println("Array is sorted.!");
        } else {
            System.out.println("Array is not sorted.!");
        }
    }

    /**
     * Program to find the minimum element of an array
     */
    private static void findMinEleInArr() {
        int[] arr = {8, 2, 6, 4, 5};
        int length, min;
        length = arr.length - 1;
        min = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element of an array is:" + min);
    }

    /**
     * Program to find maximum element in an array
     */
    private static void findMaxElementInArray() {
        int[] arr = {8, 2, 6, 4, 5};
        int length, max;
        length = arr.length - 1;
        max = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element of an array is:" + max);
    }

    /**
     * Program to reverse an array using while loop.
     */
    private static void reverseArrayUsingWhileLoop() {
        int[] arr = {1, 2, 3, 4, 5};

        int start, end;
        start = 0;
        end = arr.length - 1;
        int temp;
        //Swapping an array to reverse
        while (start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

        //print an array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    /**
     * Program to reverse an array
     */
    private static void reverseArrayUsingForLoop() {
        int[] arr = {1, 2, 3, 4, 5};

        //Reversing an array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }

        //print an array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    /**
     * Program to add two matrices of 2*3 size
     */
    private static void addTwoMatrices() {
        int[][] mat1 = {{2, 3, 4},
                {5, 6, 7}};

        int[][] mat2 = {{2, 3, 4},
                {5, 6, 7}};

        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { //row number of lines 2
            for (int j = 0; j < mat1[i].length; j++) { // column number of lines 3
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        //print two dimensional array
        for (int i = 0; i < result.length; i++) { //row number of lines 2
            for (int j = 0; j < result[i].length; j++) { // column number of lines 3
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Program to calculate the average marks of all the students using foreach loop
     */
    private static void calculateTheAverageMarkOfStudents() {
        double[] studentsPhysicsMarks = {48.5, 70.0, 95.5, 38.5, 80.0};
        double sum, avg;
        sum = 0;
        for (double mark : studentsPhysicsMarks) {
            sum += mark;
        }
        avg = sum / studentsPhysicsMarks.length;

        System.out.println("Average marks:" + avg);
//        System.out.println("Average marks:" + sum/studentsPhysicsMarks.length);
    }

    /**
     * Program to find a given integer present or not in an arry
     *
     * @param elementToFind
     */
    private static void findGivenIntInArray(int elementToFind) {
        int[] intArr = {5, 4, 6, 1, 2};
        boolean isPresent = false;
        for (int element : intArr) {
            if (element == elementToFind) {
                isPresent = true;
            }
        }

        if (isPresent) System.out.println("element found.!");
        else System.out.println("element not found.!");

    }

    /**
     * program to calculate sum of float array
     */
    private static void sumOfFloatArray() {
        float[] floatArr = {5.2f, 1.2f, 6.0f, 4.5f, 3.0f};
        float sum = 0;
        for (float element : floatArr) {
            sum += element;
        }
        System.out.println("Sum of float array: " + sum);
    }
}
