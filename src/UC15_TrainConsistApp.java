import java.util.*;

public class UC15_TrainConsistApp {

    // Step 1: Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Step 2: Goods Bogie class
    static class GoodsBogie {
        private String type;
        private String cargo;

        public GoodsBogie(String type) {
            this.type = type;
        }

        // Step 3: Assign cargo safely
        public void assignCargo(String cargo) {

            try {
                // Rule: Rectangular cannot carry Petroleum
                if (type.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe cargo assignment: Rectangular cannot carry Petroleum"
                    );
                }

                this.cargo = cargo;
                System.out.println(type + " assigned with " + cargo + " ✅");

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.\n");
            }
        }

        @Override
        public String toString() {
            return type + " (" + cargo + ")";
        }
    }

    public static void main(String[] args) {

        // Step 4: Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Step 5: Assign cargo
        b1.assignCargo("Petroleum");   // valid
        b2.assignCargo("Petroleum");   // invalid

        // Step 6: Continue program
        System.out.println("UC15: Final Bogie Status");

        System.out.println(b1);
        System.out.println(b2);
    }
}