/*
UC4 - Handles the Invalid Input through Exception Handling.

This is responsible for managing Invalid Input.

@author - Abhilaksh
@version - 5.0
 */



import java.util.*;
public class GuessingApp{
    public static void main(String[] args){
        boolean restart;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Guessing App!");


        System.out.println("Enter the name of the player: ");
        String player = sc.nextLine();

        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();
        int attempts = 0;
        int hintCount = 0;
        boolean win = false;
        try {

            do {
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
                win = true;
                break;
                }
            }
            StorageService.saveResult(player,attempts,win);
            restart = GameController.restartGame(sc);
            } while(restart);
        }
        catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }


    }
}