import java.util.*;

/**
 * Train Consist Management App - Use Case 7
 * Sorts bogies based on capacity using Comparator
 *
 * @author Rishi
 * @version 7.0
 */

// Bogie class (Custom Object)
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
public class UseCase7SortBogies {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (v7.0) =====");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\nBogies sorted by capacity:");

        for (Bogie b : bogies) {
            b.display();
        }
    }
}