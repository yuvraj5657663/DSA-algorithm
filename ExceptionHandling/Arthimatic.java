import java.util.*;

// Custom Exception
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class Arthimatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkEligibility(age);
            System.out.println("✅ You are eligible to vote.");
        } catch (UnderAgeException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }
        sc.close();
    }

    // Method to check age
    public static void checkEligibility(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Age must be 18 or above to vote.");
        }
    }
}
