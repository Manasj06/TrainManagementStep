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

    // Getter for grouping
    String getBogieType() {
        return bogieType;
    }
}

public class uc9 {
    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("First AC", 24));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("General", 90));

        // Grouping bogies by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                      .collect(Collectors.groupingBy(Bogie::getBogieType));

        // Display grouped bogies
        System.out.println("Grouped Bogies by Type:\n");

        for (String type : groupedBogies.keySet()) {
            System.out.println("Category: " + type);

            for (Bogie b : groupedBogies.get(type)) {
                b.display();
            }
            System.out.println();
        }
    }
}