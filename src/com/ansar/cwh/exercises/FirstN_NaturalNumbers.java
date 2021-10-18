package com.ansar.cwh.exercises;

import java.util.Scanner;

public class FirstN_NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= n);
    }
}
