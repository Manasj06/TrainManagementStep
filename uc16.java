/**
 * UC16: Sort Passenger Bogies by Capacity (Bubble Sort – Algorithm Intro)
 * Demonstrates manual sorting without using Collections.sort().
 */

public class uc16 {

    // Class representing a Passenger Bogie
    static class PassengerBogie {
        private String bogieId;
        private int capacity;

        // Constructor
        public PassengerBogie(String bogieId, int capacity) {
            this.bogieId = bogieId;
            this.capacity = capacity;
        }

        // Getter for capacity
        public int getCapacity() {
            return capacity;
        }

        // Getter for bogie ID
        public String getBogieId() {
            return bogieId;
        }

        // Display bogie details
        @Override
        public String toString() {
            return "Bogie ID: " + bogieId + ", Capacity: " + capacity;
        }
    }

    /**
     * Bubble Sort method to sort passenger bogies by capacity in ascending order.
     */
    public static void bubbleSort(PassengerBogie[] bogies) {
        int n = bogies.length;
        boolean swapped;

        System.out.println("\n🔄 Sorting Passenger Bogies Using Bubble Sort...\n");

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (bogies[j].getCapacity() > bogies[j + 1].getCapacity()) {
                    // Swap bogies
                    PassengerBogie temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: Stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to display bogies
    public static void displayBogies(PassengerBogie[] bogies) {
        for (PassengerBogie bogie : bogies) {
            System.out.println(bogie);
        }
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM - UC16");
        System.out.println(" Manual Sorting Using Bubble Sort");
        System.out.println("==============================================");

        // Creating passenger bogies with capacities
        PassengerBogie[] bogies = {
            new PassengerBogie("PB101", 72),
            new PassengerBogie("PB102", 54),
            new PassengerBogie("PB103", 90),
            new PassengerBogie("PB104", 60),
            new PassengerBogie("PB105", 48)
        };

        // Display unsorted bogies
        System.out.println("\n📋 Passenger Bogies Before Sorting:");
        displayBogies(bogies);

        // Sort using Bubble Sort
        bubbleSort(bogies);

        // Display sorted bogies
        System.out.println("\n📋 Passenger Bogies After Sorting (Ascending Order):");
        displayBogies(bogies);

        System.out.println("\n==============================================");
        System.out.println(" Sorting Completed Successfully");
        System.out.println("==============================================");
    }
}