import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App - Use Case 1
 * Initializes train and displays consist summary
 *
 * @author Rishi
 * @version 1.0
 */
public class UseCase1TrainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("\nTrain initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues...
    }
}