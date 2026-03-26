import java.util.ArrayList;
import java.util.List;

public class uc2 {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 4: Display bogies after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 5: Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 6: Display bogies after removal
        System.out.println("\nPassenger Bogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // Step 7: Check existence of "Sleeper"
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist in the train.");
        }

        // Step 8: Final list state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        // Program continues...
    }
}