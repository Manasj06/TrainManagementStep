import java.util.*;
import java.util.function.Predicate;

// 🔹 Goods Bogie Class
class GoodsBogie {
    String id;
    String shape;      // Cylindrical / Rectangular
    String cargoType;  // Oil, Coal, etc.

    public GoodsBogie(String id, String shape, String cargoType) {
        this.id = id;
        this.shape = shape;
        this.cargoType = cargoType;
    }

    public String getShape() {
        return shape;
    }

    public String getCargoType() {
        return cargoType;
    }

    public String getId() {
        return id;
    }
}

// 🔹 Main Class
public class uc12 {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        // Sample Data
        bogies.add(new GoodsBogie("G1", "Cylindrical", "Oil"));       // ✅ valid
        bogies.add(new GoodsBogie("G2", "Cylindrical", "Coal"));      // ❌ invalid
        bogies.add(new GoodsBogie("G3", "Rectangular", "Coal"));      // ✅ valid
        bogies.add(new GoodsBogie("G4", "Rectangular", "Petroleum")); // ❌ invalid

        // 🔥 Functional Interface using Lambda
        Predicate<GoodsBogie> safetyRule = b -> {
            if (b.getShape().equalsIgnoreCase("Cylindrical")) {
                return b.getCargoType().equalsIgnoreCase("Oil") ||
                       b.getCargoType().equalsIgnoreCase("Petroleum") ||
                       b.getCargoType().equalsIgnoreCase("Gas");
            } else if (b.getShape().equalsIgnoreCase("Rectangular")) {
                return b.getCargoType().equalsIgnoreCase("Coal") ||
                       b.getCargoType().equalsIgnoreCase("Grain") ||
                       b.getCargoType().equalsIgnoreCase("Cement");
            }
            return false;
        };

        // 🔥 Apply validation using Streams
        System.out.println("=== Safety Compliance Check ===");

        bogies.stream().forEach(b -> {
            if (safetyRule.test(b)) {
                System.out.println("✅ Bogie " + b.getId() + " is SAFE");
            } else {
                System.out.println("❌ Bogie " + b.getId() + " is UNSAFE");
            }
        });
    }
}