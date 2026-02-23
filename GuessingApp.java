/*
UC4 - Handles the Invalid Input through Exception Handling.

This is responsible for managing Invalid Input.
 */



import java.util.*;
public class GuessingApp{
    public static void main(String[] args){
        System.out.println("Welcome to the Guessing App!");
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int hintCount = 0;

        try {

            while (attempts < gameConfig.getMaxAttempts()) {
                System.out.print("Enter your guess: ");
                int guess = ValidationService.validateInput(sc.nextLine());
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
        catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

    }
}