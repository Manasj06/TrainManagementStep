import java.util.*;

// 🔥 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Passenger Bogie Class
class PassengerBogie {
    String id;
    String type;
    int capacity;

    public PassengerBogie(String id, String type, int capacity) throws InvalidCapacityException {
        
        // 🔥 Fail-Fast Validation
        if (capacity <= 0) {
            throw new InvalidCapacityException(
                "Invalid capacity for Bogie " + id + ": " + capacity
            );
        }

        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(id + " | " + type + " | Capacity: " + capacity);
    }
}

// 🔹 Main Class
public class uc14 {

    public static void main(String[] args) {

        List<PassengerBogie> train = new ArrayList<>();

        try {
            // ✅ Valid Bogies
            train.add(new PassengerBogie("P1", "Sleeper", 72));
            train.add(new PassengerBogie("P2", "AC Chair", 50));

            // ❌ Invalid Bogies (will throw exception)
            train.add(new PassengerBogie("P3", "First Class", -10));
            train.add(new PassengerBogie("P4", "General", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("❌ Exception Caught: " + e.getMessage());
        }

        // 🔹 Display valid bogies
        System.out.println("\n=== Valid Bogies in Train ===");
        for (PassengerBogie b : train) {
            b.display();
        }
    }
}