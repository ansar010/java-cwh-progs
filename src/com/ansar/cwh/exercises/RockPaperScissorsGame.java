package com.ansar.cwh.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * Implements a program for Rock, Paper, Scissors game.
 */
public class RockPaperScissorsGame {

    public static void main(String[] args) {
        int ROCK, PAPER, SCISSOR, rounds, userPoints, computerPoints;
        ROCK = 1;
        PAPER = 2;
        SCISSOR = 3;
        rounds = 0;
        userPoints = 0;
        computerPoints = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to To RPS game.");
        System.out.println("Please enter your name");
        String playerName = sc.nextLine();

        System.out.printf("Rock: %d\t Paper: %d\t Scissor: %d\n", ROCK, PAPER, SCISSOR);

        while (rounds < 5) {
            System.out.println("Choose your option from 1/2/3");
            int userOption = sc.nextInt();

            int computerOption = random.nextInt(3) + 1;
            System.out.println("Computer Choose: " + computerOption);

            if (userOption == ROCK && computerOption == PAPER) {
                computerPoints += 1;
            } else if (userOption == PAPER && computerOption == ROCK) {
                userPoints += 1;
            } else if (userOption == ROCK && computerOption == SCISSOR) {
                userPoints += 1;
            } else if (userOption == SCISSOR && computerOption == ROCK) {
                computerPoints += 1;
            } else if (userOption == PAPER && computerOption == SCISSOR) {
                computerPoints += 1;
            } else if (userOption == SCISSOR && computerOption == PAPER) {
                userPoints += 1;
            }
//            System.out.println("User points "+userPoints);
//            System.out.println("Computer points "+computerPoints);
            rounds++;
        }
        System.out.println();
        System.out.println(playerName + " points : " + userPoints);
        System.out.println("Computer points : " + computerPoints);

        if (userPoints > computerPoints) {
            System.out.println(playerName + " won");
        } else {
            System.out.println("Computer won");

        }
    }
}
