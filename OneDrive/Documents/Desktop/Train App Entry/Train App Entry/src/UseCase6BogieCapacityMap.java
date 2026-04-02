import java.util.HashMap;
import java.util.Map;

/**
 * Train Consist Management App - Use Case 6
 * Maps bogies to their seating/load capacity using HashMap
 *
 * @author Rishi
 * @version 6.0
 */
public class UseCase6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (v6.0) =====");

        // Create HashMap
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);
        bogieCapacity.put("Cargo", 100);

        // Display data using entrySet
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}