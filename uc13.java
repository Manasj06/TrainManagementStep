import java.util.*;
import java.util.function.Predicate;

class GoodsBogie {
    String id;
    String shape;
    String cargoType;

    public GoodsBogie(String id, String shape, String cargoType) {
        this.id = id;
        this.shape = shape;
        this.cargoType = cargoType;
    }

    public String getShape() { return shape; }
    public String getCargoType() { return cargoType; }
}

public class uc13 {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        // 🔹 Create large dataset
        String[] shapes = {"Cylindrical", "Rectangular"};
        String[] cargo = {"Oil", "Coal", "Gas", "Cement", "Petroleum", "Grain"};

        for (int i = 0; i < 100000; i++) {
            bogies.add(new GoodsBogie(
                    "G" + i,
                    shapes[i % 2],
                    cargo[i % 6]
            ));
        }

        // 🔹 Safety Rule (same for both)
        Predicate<GoodsBogie> safetyRule = b -> {
            if (b.getShape().equalsIgnoreCase("Cylindrical")) {
                return b.getCargoType().equalsIgnoreCase("Oil") ||
                       b.getCargoType().equalsIgnoreCase("Petroleum") ||
                       b.getCargoType().equalsIgnoreCase("Gas");
            } else {
                return b.getCargoType().equalsIgnoreCase("Coal") ||
                       b.getCargoType().equalsIgnoreCase("Grain") ||
                       b.getCargoType().equalsIgnoreCase("Cement");
            }
        };

        // 🔥 1. Loop Approach
        long startLoop = System.nanoTime();

        int safeCountLoop = 0;
        for (GoodsBogie b : bogies) {
            if (safetyRule.test(b)) {
                safeCountLoop++;
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔥 2. Stream Approach
        long startStream = System.nanoTime();

        long safeCountStream = bogies.stream()
                                     .filter(safetyRule)
                                     .count();

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // 🔹 Output
        System.out.println("=== Performance Comparison ===");

        System.out.println("Loop Safe Count: " + safeCountLoop);
        System.out.println("Loop Time (ns): " + loopTime);

        System.out.println("-----------------------------");

        System.out.println("Stream Safe Count: " + safeCountStream);
        System.out.println("Stream Time (ns): " + streamTime);

        // 🔹 Final Comparison
        if (loopTime < streamTime) {
            System.out.println("👉 Loop is faster");
        } else {
            System.out.println("👉 Stream is faster");
        }
    }
}