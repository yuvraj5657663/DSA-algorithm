import java.util.Scanner;

public class StudentMarksSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();        

        int[] marks = new int[numStudents];        

        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();           
        }

        int sum = 0;                                 
        int max = marks[0];                        
        int min = marks[0];                        
        int passed = 0;                             

       
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];                        
            if (marks[i] > max) max = marks[i];     
            if (marks[i] < min) min = marks[i];     
            if (marks[i] >= 40) passed++;           
        }

        double average = (double) sum / numStudents; 

        System.out.println("\n----- Result Summary -----");
        System.out.println("Total Students: " + numStudents);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
        System.out.println("Students Passed: " + passed);
        System.out.println("Students Failed: " + (numStudents - passed));

        System.out.println("\nMarks of All Students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        scanner.close(); 
    }
}
