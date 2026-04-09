import java.util.*;
import java.util.stream.*;

public class UC12_TrainConsistApp {

    // Goods Bogie class
    static class GoodsBogie {
        private String type;
        private String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return type + " (" + cargo + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: Create list
        List<GoodsBogie> bogies = new ArrayList<>();

        // Step 2: Add goods bogies
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 3: Safety check using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                                b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Step 4: Output
        System.out.println("UC12: Safety Compliance Check");

        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }
    }
}