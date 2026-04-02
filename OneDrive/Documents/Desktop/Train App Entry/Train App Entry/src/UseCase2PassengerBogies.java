import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App - Use Case 2
 * Add, remove and check passenger bogies using ArrayList
 *
 * @author Rishi
 * @version 2.0
 */
public class UseCase2PassengerBogies {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (v2.0) =====");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // Final state
        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);
    }
}