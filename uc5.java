import java.util.LinkedHashSet;
import java.util.Set;

public class uc5 {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Add bogies (in order)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Try adding duplicate bogie
        trainFormation.add("Sleeper"); // duplicate (will be ignored)

        // Step 5: Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved, No Duplicates):");
        System.out.println(trainFormation);

        // Program continues...
    }
}