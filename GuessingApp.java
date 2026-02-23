/*
UC2 - Comparing User Guess Submission

This is responsible for comparing User's guess with the target number.
 */

import java.util.*;

public class GuessingApp{
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing App!");
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        while (attempts < gameConfig.getMaxAttempts()) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            String result = GuessValidator.validateGuess(guess, gameConfig.getTargetNumber());

            System.out.println(result);

            if ("CORRECT".equals(result)) {
                break;
            }
        }

    }
}