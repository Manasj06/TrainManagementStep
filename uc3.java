import java.util.HashSet;
import java.util.Set;

public class uc3 {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashSet for bogie IDs (ensures uniqueness)
        Set<String> bogieIds = new HashSet<>();

        // Step 3: Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Step 4: Display unique bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates removed automatically):");
        System.out.println(bogieIds);

        // Program continues...
    }
}