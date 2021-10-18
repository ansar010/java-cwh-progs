package com.ansar.cwh.exercises;

import java.util.Scanner;

public class PrintFirstN_OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
