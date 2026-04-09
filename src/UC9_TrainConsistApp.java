import java.util.*;
import java.util.stream.Collectors;

public class UC9_TrainConsistApp {

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
            return "Bogie{type='" + type + "', capacity=" + capacity + "}";
        }
    }

    public static void main(String[] args) {

        // Step 1: Initialize list
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 30));
        bogies.add(new Bogie("AC Chair", 50));

        // Step 3: Group using groupingBy()
        Map<String, List<Bogie>> groupedMap =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // Step 4: Print result
        System.out.println("UC9: Grouped Bogies\n");

        for (String type : groupedMap.keySet()) {
            System.out.println("Type: " + type);

            for (Bogie b : groupedMap.get(type)) {
                System.out.println("   " + b);
            }
        }
    }
}