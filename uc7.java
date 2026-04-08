import java.util.*;

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

// Comparator class for sorting by capacity
class CapacityComparator implements Comparator<Bogie> {

    @Override
    public int compare(Bogie b1, Bogie b2) {
        // Ascending order
        return b1.capacity - b2.capacity;

        // For descending order, use:
        // return b2.capacity - b1.capacity;
    }
}

public class uc7 {
    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("First AC", 24));

        // Sorting using Comparator
        Collections.sort(bogies, new CapacityComparator());

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity:\n");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}