import java.util.LinkedHashSet;

/**
 * Train Consist Management App - Use Case 5
 * Maintains insertion order and uniqueness using LinkedHashSet
 *
 * @author Rishi
 * @version 5.0
 */
public class UseCase5LinkedHashSetTrain {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (v5.0) =====");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Try adding duplicate
        train.add("Sleeper"); // duplicate → ignored

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);
    }
}