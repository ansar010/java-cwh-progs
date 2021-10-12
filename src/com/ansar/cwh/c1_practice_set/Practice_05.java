package com.ansar.cwh.c1_practice_set;

import java.util.Scanner;

public class Practice_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean numberCheck = scanner.hasNextInt();
        System.out.println("Entered value is integer: " + numberCheck);
    }
}
