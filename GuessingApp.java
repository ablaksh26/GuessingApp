
/*
UC1 - Game Initialization

This class sets the Game Boundaries, generate a random target number and display 
the game rules.
It demonstrates Encapsulation, constructor initialisation and random number generation.
 */
import java.util.*;

public class GuessingApp{
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing App!");
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

    }
}