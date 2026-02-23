/**
 UC5: Game result storage 

 This feature is used for persisting the final 
 game result after the game ends.
 */
import java.io.*;
class StorageService {
    public static void saveResult(String player, int attempts, boolean win) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("game_results.txt",true))) {
            writer.write("Player: " + player+ ", Attempts: "+ attempts + ", Results: " + (win ? "WIN":"LOSE"));
            writer.newLine();
        }
        catch(IOException e) {
            System.out.println("Unable to save the game result!");
        }

    }
}