import java.util.LinkedList;

/**
 * Train Consist Management App - Use Case 4
 * Maintains ordered bogie sequence using LinkedList
 *
 * @author Rishi
 * @version 4.0
 */
public class UseCase4TrainLinkedList {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (v4.0) =====");

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train:");
        System.out.println(train);

        // Insert Pantry at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(train);

        // Remove first and last
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Final output
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}