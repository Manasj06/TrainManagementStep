import java.util.*;
import java.util.stream.*;

// Base class
abstract class Bogie {
    String id;

    public Bogie(String id) {
        this.id = id;
    }
}

// Passenger Bogie
class PassengerBogie extends Bogie {
    String type; // Sleeper, AC Chair, First Class
    int seatCapacity;

    public PassengerBogie(String id, String type, int seatCapacity) {
        super(id);
        this.type = type;
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }
}

// Goods Bogie
class GoodsBogie extends Bogie {
    String cargoType;

    public GoodsBogie(String id, String cargoType) {
        super(id);
        this.cargoType = cargoType;
    }
}

// Main class
public class uc10 {

    public static void main(String[] args) {

        List<Bogie> train = new ArrayList<>();

        // Adding Passenger Bogies
        train.add(new PassengerBogie("P1", "Sleeper", 72));
        train.add(new PassengerBogie("P2", "AC Chair", 50));
        train.add(new PassengerBogie("P3", "First Class", 30));

        // Adding Goods Bogies
        train.add(new GoodsBogie("G1", "Coal"));
        train.add(new GoodsBogie("G2", "Oil"));

        // 🔥 UC10: Total Seat Count using reduce()

        int totalSeats = train.stream()

                // Step 1: Filter passenger bogies
                .filter(b -> b instanceof PassengerBogie)

                // Step 2: Convert Bogie -> PassengerBogie
                .map(b -> (PassengerBogie) b)

                // Step 3: Extract seat capacity
                .map(PassengerBogie::getSeatCapacity)

                // Step 4: Reduce (sum all values)
                .reduce(0, Integer::sum);

        // Output
        System.out.println("Total Seat Capacity of Train: " + totalSeats);
    }
}