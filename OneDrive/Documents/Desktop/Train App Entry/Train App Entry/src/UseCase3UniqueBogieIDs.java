import java.util.HashSet;
import java.util.Set;

/**
 * Train Consist Management App - Use Case 3
 * Ensures unique bogie IDs using HashSet
 *
 * @author Rishi
 * @version 3.0
 */
public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (v3.0) =====");

        // Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display final set
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);
    }
}