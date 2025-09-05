package java_method;
import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() generates [0,1), multiply by 900000 + 100000 to ensure 6 digits
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if OTPs are unique
    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) { // duplicate found
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Print all generated OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Check uniqueness
        if (areUnique(otps)) {
            System.out.println("✅ All OTPs are unique.");
        } else {
            System.out.println("❌ Duplicate OTPs found.");
        }
    }
}