/**
Handles game lifecycle decisions.

This class is responsible for deciding whether the game should restart or exit

 */
import java.util.*;

public class GameController {
    
    public static boolean restartGame(Scanner scanner) {
        System.out.println("Do you want to play again? (yes/no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}