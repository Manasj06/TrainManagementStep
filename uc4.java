import java.util.LinkedList;

public class uc4 {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 3: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 4: Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Step 5: Insert Pantry Car at position 2 (index 1-based → index 2 = position 3)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 3:");
        System.out.println(trainConsist);

        // Step 6: Remove first and last bogie
        trainConsist.removeFirst(); // removes Engine
        trainConsist.removeLast();  // removes Guard

        // Step 7: Display final consist
        System.out.println("\nFinal Train Consist after removals:");
        System.out.println(trainConsist);

        // Program continues...
    }
}