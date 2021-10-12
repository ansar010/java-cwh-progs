package com.ansar.cwh.c1_practice_set;

import java.util.Scanner;

public class GreetUser_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", Have a good day.!");
    }
}
