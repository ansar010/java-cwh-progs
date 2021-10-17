package com.ansar.cwh.c4_practice_set;

import java.util.Scanner;

public class PS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Probelm2
//        passFail(sc);

        //Problem3
//        taxCalculator(sc);

        //Problem4
//        dayOfWeek(sc);

        //Problem5
//        isLeapYear(sc);

        //Problem6
        findTypeOfWebsite(sc);
        sc.close();
    }

    private static void findTypeOfWebsite(Scanner sc) {
        System.out.println("Type your website");
        String website = sc.nextLine();

        if (website.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("Organization website");
        } else if (website.endsWith(".in")) {
            System.out.println("India website");
        }
    }

    private static void isLeapYear(Scanner sc) {
        System.out.println("Enter an year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("The entered year %d is a leap year", year);
        } else {
            System.out.printf("The entered year %d is not a leap year", year);
        }
    }

    private static void dayOfWeek(Scanner sc) {
        System.out.println("Enter the number of the Day");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect day number.!");
        }
    }

    private static void taxCalculator(Scanner sc) {
        System.out.println("Enter your Annual package.!");
        double income = sc.nextDouble();
        double tax = 0;
        if (income < 2.5) {
            tax += 0;
        } else if (income > 2.5 && income <= 5.0) {
            tax = tax + 0.05 * (income - 2.5);
        } else if (income > 5.0 && income <= 1000000) {
            tax = tax + 0.5 * (5.0 - 2.5);
            tax = tax + 0.2 * (income - 5.0);
        } else if (income > 1000000) {
            tax = tax + 0.05 * (5.0 - 2.5);
            tax = tax + 0.2 * (10 - 5.0);
            tax = tax + 0.3 * (income - 10);
        }
        System.out.println("The total tax paid by the employee is: " + tax);
    }

    private static void passFail(Scanner sc) {
        System.out.println("Enter your marks in Java Programming");
        byte sub1 = sc.nextByte();

        System.out.println("Enter your marks in Data Structure");
        byte sub2 = sc.nextByte();

        System.out.println("Enter your marks Mathematics");
        byte sub3 = sc.nextByte();

        float total = (sub1 + sub2 + sub3) / 3.0f;

        System.out.println("Your overall percentage is:" + total);
        if (total >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Congratulations, You have been promoted..!");
        } else {
            System.out.println("Sorry, You have not been promoted.");
        }
    }
}
