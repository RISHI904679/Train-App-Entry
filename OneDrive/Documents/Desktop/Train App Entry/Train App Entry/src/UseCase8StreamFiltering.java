import java.util.*;
import java.util.stream.Collectors;

/**
 * Train Consist Management App - Use Case 8
 * Filters bogies using Stream API
 *
 * @author Rishi
 * @version 8.0
 */

// Bogie class (reuse from UC7)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " -> Capacity: " + capacity);
    }
}

// Main class
public class UseCase8StreamFiltering {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (v8.0) =====");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Super Luxury", 80));

        // Filter bogies with capacity > 60
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");

        for (Bogie b : filtered) {
            b.display();
        }

        // Show original list unchanged
        System.out.println("\nOriginal List (Unchanged):");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}