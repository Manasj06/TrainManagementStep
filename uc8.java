import java.util.*;
import java.util.stream.*;

// Class representing a Bogie
class Bogie {
    String bogieType;
    int capacity;

    // Constructor
    Bogie(String bogieType, int capacity) {
        this.bogieType = bogieType;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(bogieType + " - Capacity: " + capacity);
    }
}

public class uc8 {
    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("First AC", 24));

        // Filtering bogies with capacity greater than 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):\n");
        filteredBogies.forEach(b -> b.display());
    }
}