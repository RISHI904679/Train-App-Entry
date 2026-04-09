import java.util.*;
import java.util.stream.*;

public class UC10_TrainConsistApp {

    // Bogie class
    static class Bogie {
        private String type;
        private int capacity;

        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 30));
        bogies.add(new Bogie("AC Chair", 50));

        // Step 3: map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 4: Print result
        System.out.println("UC10: Total Seating Capacity");
        System.out.println("Total Seats = " + totalSeats);
    }
}