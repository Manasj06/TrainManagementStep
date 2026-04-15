/**
 * UC17: Sort Bogie Names Using Arrays.sort()
 * Train Consist Management System
 * Demonstrates efficient alphabetical sorting using Java's built-in method.
 */

import java.util.Arrays;

public class uc17 {

    // Method to display bogie names
    public static void displayBogies(String[] bogies) {
        for (String bogie : bogies) {
            System.out.println(bogie);
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM - UC17");
        System.out.println(" Sorting Bogie Names Using Arrays.sort()");
        System.out.println("==================================================");

        // Array of bogie type names
        String[] bogieNames = {
            "Sleeper",
            "General",
            "AC First Class",
            "AC Two Tier",
            "AC Three Tier",
            "Chair Car",
            "Executive Chair Car",
            "Pantry Car",
            "Luggage Van",
            "Parcel Van"
        };

        // Display unsorted bogie names
        System.out.println("\n📋 Bogie Names Before Sorting:");
        displayBogies(bogieNames);

        // Sorting using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display sorted bogie names
        System.out.println("\n📋 Bogie Names After Sorting (Alphabetical Order):");
        displayBogies(bogieNames);

        System.out.println("\n==================================================");
        System.out.println(" Sorting Completed Using Arrays.sort()");
        System.out.println("==================================================");
    }
}