/**
 * UC15: Safe Cargo Assignment Using try-catch-finally
 * Train Consist Management App
 * Demonstrates safe runtime handling of unsafe cargo assignments.
 */

public class uc15 {

    // Enum representing different cargo types
    enum CargoType {
        COAL,
        GRAINS,
        PETROLEUM,
        CHEMICALS,
        CONTAINERS
    }

    // Enum representing bogie shapes
    enum BogieShape {
        RECTANGULAR,
        CYLINDRICAL,
        OPEN,
        FLAT
    }

    // Custom Exception for unsafe cargo assignments
    static class UnsafeCargoException extends Exception {
        public UnsafeCargoException(String message) {
            super(message);
        }
    }

    // Class representing a railway bogie
    static class Bogie {
        private String bogieId;
        private BogieShape shape;
        private CargoType assignedCargo;

        // Constructor
        public Bogie(String bogieId, BogieShape shape) {
            this.bogieId = bogieId;
            this.shape = shape;
        }

        // Method to assign cargo safely
        public void assignCargo(CargoType cargo) throws UnsafeCargoException {
            if (!isCargoSafe(cargo)) {
                throw new UnsafeCargoException(
                        "Unsafe Cargo Assignment: " + cargo +
                        " cannot be assigned to a " + shape + " bogie."
                );
            }

            this.assignedCargo = cargo;
            System.out.println("✅ Cargo " + cargo +
                    " assigned to Bogie " + bogieId);
        }

        // Safety validation logic
        private boolean isCargoSafe(CargoType cargo) {
            switch (cargo) {
                case PETROLEUM:
                case CHEMICALS:
                    return shape == BogieShape.CYLINDRICAL;

                case COAL:
                case GRAINS:
                    return shape == BogieShape.OPEN ||
                           shape == BogieShape.RECTANGULAR;

                case CONTAINERS:
                    return shape == BogieShape.FLAT ||
                           shape == BogieShape.RECTANGULAR;

                default:
                    return false;
            }
        }

        @Override
        public String toString() {
            return "Bogie ID: " + bogieId +
                   ", Shape: " + shape +
                   ", Assigned Cargo: " +
                   (assignedCargo != null ? assignedCargo : "None");
        }
    }

    // Main method demonstrating try-catch-finally
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("   TRAIN CONSIST MANAGEMENT SYSTEM - UC15");
        System.out.println("==============================================");

        // Creating bogies
        Bogie rectangularBogie = new Bogie("B101", BogieShape.RECTANGULAR);
        Bogie cylindricalBogie = new Bogie("B102", BogieShape.CYLINDRICAL);
        Bogie openBogie = new Bogie("B103", BogieShape.OPEN);

        // Case 1: Unsafe assignment
        try {
            System.out.println("\nAttempting to assign PETROLEUM to RECTANGULAR bogie...");
            rectangularBogie.assignCargo(CargoType.PETROLEUM);
        } catch (UnsafeCargoException e) {
            System.out.println("❌ ERROR: " + e.getMessage());
        } finally {
            System.out.println("📌 Logging: Attempt completed for Bogie B101.");
        }

        // Case 2: Safe assignment
        try {
            System.out.println("\nAttempting to assign PETROLEUM to CYLINDRICAL bogie...");
            cylindricalBogie.assignCargo(CargoType.PETROLEUM);
        } catch (UnsafeCargoException e) {
            System.out.println("❌ ERROR: " + e.getMessage());
        } finally {
            System.out.println("📌 Logging: Attempt completed for Bogie B102.");
        }

        // Case 3: Another safe assignment
        try {
            System.out.println("\nAttempting to assign COAL to OPEN bogie...");
            openBogie.assignCargo(CargoType.COAL);
        } catch (UnsafeCargoException e) {
            System.out.println("❌ ERROR: " + e.getMessage());
        } finally {
            System.out.println("📌 Logging: Attempt completed for Bogie B103.");
        }

        // Display final bogie status
        System.out.println("\n==============================================");
        System.out.println("Final Bogie Status:");
        System.out.println(rectangularBogie);
        System.out.println(cylindricalBogie);
        System.out.println(openBogie);
        System.out.println("==============================================");
    }
}