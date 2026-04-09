import java.util.*;

public class UC14_TrainConsistApp {

    // Step 1: Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Step 2: Passenger Bogie Class
    static class PassengerBogie {
        private String type;
        private int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            // Step 3: Validation
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 50));

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("First Class", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Print valid bogies
        System.out.println("\nUC14: Valid Bogies List");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}