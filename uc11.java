import java.util.regex.*;
import java.util.Scanner;

public class uc11 {

    // 🔹 Validate Train ID
    public static boolean validateTrainId(String trainId) {
        String regex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // 🔹 Validate Cargo Code
    public static boolean validateCargoCode(String cargoCode) {
        String regex = "CG-[A-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Train ID
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        if (validateTrainId(trainId)) {
            System.out.println("✅ Valid Train ID");
        } else {
            System.out.println("❌ Invalid Train ID (Format: TRN-1234)");
        }

        // Input Cargo Code
        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        if (validateCargoCode(cargoCode)) {
            System.out.println("✅ Valid Cargo Code");
        } else {
            System.out.println("❌ Invalid Cargo Code (Format: CG-FOOD)");
        }

        sc.close();
    }
}