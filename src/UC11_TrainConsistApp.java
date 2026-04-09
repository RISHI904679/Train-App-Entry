import java.util.regex.*;
import java.util.Scanner;

public class UC11_TrainConsistApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Step 2: Define Regex
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 3: Compile Pattern
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Step 4: Match input
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Step 5: Validate
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Step 6: Output
        System.out.println("\nUC11: Validation Result");

        if (isTrainValid) {
            System.out.println("Valid Train ID ✅");
        } else {
            System.out.println("Invalid Train ID ❌");
        }

        if (isCargoValid) {
            System.out.println("Valid Cargo Code ✅");
        } else {
            System.out.println("Invalid Cargo Code ❌");
        }

        sc.close();
    }
}