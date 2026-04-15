/**
 * UC18: Linear Search for Bogie ID (Array-Based Searching)
 * Train Consist Management System
 * Demonstrates searching for a specific bogie in an unsorted list.
 */

public class uc18{

    // Class representing a Bogie
    static class Bogie {
        private String bogieId;
        private String bogieType;
        private int capacity;

        // Constructor
        public Bogie(String bogieId, String bogieType, int capacity) {
            this.bogieId = bogieId;
            this.bogieType = bogieType;
            this.capacity = capacity;
        }

        // Getter for Bogie ID
        public String getBogieId() {
            return bogieId;
        }

        // Display bogie details
        @Override
        public String toString() {
            return "Bogie ID: " + bogieId +
                   ", Type: " + bogieType +
                   ", Capacity: " + capacity;
        }
    }

    /**
     * Linear Search method to find a bogie by ID.
     *
     * @param bogies Array of bogies
     * @param targetId Bogie ID to search
     * @return Index of the bogie if found, otherwise -1
     */
    public static int linearSearch(Bogie[] bogies, String targetId) {
        for (int i = 0; i < bogies.length; i++) {
            if (bogies[i].getBogieId().equalsIgnoreCase(targetId)) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Method to display all bogies
    public static void displayBogies(Bogie[] bogies) {
        System.out.println("\n📋 List of Bogies in the Train Consist:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM - UC18");
        System.out.println(" Linear Search for Bogie ID");
        System.out.println("==================================================");

        // Creating an unsorted array of bogies
        Bogie[] bogies = {
            new Bogie("B103", "Sleeper", 72),
            new Bogie("B101", "General", 90),
            new Bogie("B108", "AC Three Tier", 64),
            new Bogie("B105", "Chair Car", 78),
            new Bogie("B102", "AC Two Tier", 54),
            new Bogie("B110", "Pantry Car", 20)
        };

        // Display all bogies
        displayBogies(bogies);

        // Bogie ID to search
        String searchId = "B105";

        System.out.println("\n🔍 Searching for Bogie ID: " + searchId);

        // Perform Linear Search
        int index = linearSearch(bogies, searchId);

        // Display result
        if (index != -1) {
            System.out.println("\n✅ Bogie Found at Position: " + (index + 1));
            System.out.println("📌 Bogie Details:");
            System.out.println(bogies[index]);
        } else {
            System.out.println("\n❌ Bogie with ID " + searchId + " not found.");
        }

        System.out.println("\n==================================================");
        System.out.println(" Search Operation Completed");
        System.out.println("==================================================");
    }
}