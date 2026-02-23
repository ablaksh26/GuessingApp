import java.util.*;

class GameConfig {
    // Setting the final variables that are going to be used.
    private final int MIN = 1;
    private final int MAX = 100;
    private final int MAX_ATTEMPTS = 7;
    private final int MAX_HINTS = 3;
    // The variables are declared as private because we don't want users to
    // directly access and mainpulate them.

    int targetNumber;

    public GameConfig() {
        Random random = new Random();
        this.targetNumber = random.nextInt(MAX-MIN+1);
    }

    public int getTargetNumber() {return targetNumber;}

    public int getMaxAttempts() {return MAX_ATTEMPTS;}

    public int getMaxHints() {return MAX_HINTS;}

    // Leading the things to the console.
    public void showRules() {
        System.out.println("Guess a number between " + MIN + " and " + MAX);
        System.out.println("You have " + MAX_ATTEMPTS + "attempts.");
        System.out.println("Hints will be provided after wrong guesses.\n");
    }

}