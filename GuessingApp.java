/*
UC3 - Added the Hint Message service.

This is responsible for providing hint to User's guess with the target number.
 */



import java.util.*;

public class GuessingApp{
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing App!");
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int hintCount = 0;

        while (attempts < gameConfig.getMaxAttempts()) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            int targetNumber = gameConfig.getTargetNumber();

            String result = GuessValidator.validateGuess(guess, targetNumber);
            String hint = HintService.generateHint(targetNumber, ++hintCount);

            System.out.println(result);
            if (hintCount<4) System.out.println(hint);

            if ("CORRECT".equals(result)) {
                break;
            }
        }

    }
}