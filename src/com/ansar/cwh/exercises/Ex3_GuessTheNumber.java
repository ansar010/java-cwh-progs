package com.ansar.cwh.exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex3_GuessTheNumber {
    public static void main(String[] args) {
        Game game = new Game();
        while (!game.isCorrectNumber()) {
            game.takeUserInput();
        }
    }
}

class Game {
    Scanner sc = new Scanner(System.in);
    private int noOfGuesses = 0;
    private int computerNumber;
    private int userNumber;

    public Game() {
        Random random = new Random();
        computerNumber = random.nextInt(100) + 1;
    }

    public void takeUserInput() {
        System.out.println("Enter guessed number");
        userNumber = sc.nextInt();
        noOfGuesses++;
    }

    public boolean isCorrectNumber() {

        if (userNumber >= 1 && computerNumber >= 1) {
            if (computerNumber == userNumber) {
                System.out.println("Guess Matched.!");
                System.out.printf("Number of guess %d", noOfGuesses);
                return true;
            } else if (userNumber > computerNumber) {
                System.out.println("Your guess is greater");
            } else if (userNumber < computerNumber) {
                System.out.println("Your guess is less");
            }
        }
        return false;
    }
}
