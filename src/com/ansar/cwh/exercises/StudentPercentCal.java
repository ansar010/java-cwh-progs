package com.ansar.cwh.exercises;

import java.util.Scanner;

/**
 * implement a program to calculate student percentage
 */
public class StudentPercentCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to percentage calculator");

        System.out.println("Enter mark for subject 1");
        float subject1 = sc.nextFloat();

        System.out.println("Enter mark for subject 2");
        float subject2 = sc.nextFloat();

        System.out.println("Enter mark for subject 3");
        float subject3 = sc.nextFloat();

        System.out.println("Enter mark for subject 4");
        float subject4 = sc.nextFloat();

        float percentage = ((subject1 + subject2 + subject3 + subject4) / 400) * 100;
        System.out.println("Your percentage is : " + percentage);

    }
}
