import java.util.*;

public class StudentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = { "Yuvraj", "Aman", "Priya", "Ravi", "Neha" };

        System.out.print("Enter student index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Student: " + students[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter between 0 and 4.");
        }

        sc.close();
    }
}
