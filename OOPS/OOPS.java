import java.util.*;

public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = " yuvraj ";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 90;
        s1.marks[1] = 100;

        // Shallow copy example
        Student s3 = new Student();
        s3.name = s1.name;
        s3.roll = s1.roll;
        s3.password = s1.password;
        s3.marks = s1.marks; // shallow copy: both refer to same marks array
        s3.password = "shallow";
        s3.marks[0] = 50; // changes will reflect in s1.marks too

        System.out.println("Shallow copy marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s3.marks[i]);
        }
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // deep copy
        s2.password = "dasf";
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
        class Student {
            String name;
            int roll;
            String password;
            int marks[];

            // deep copy constructor 
            Student(Student s1) {
                marks = new int[3];
                this.name = s1.name;
                this.roll = s1.roll;
                for (int i = 0; i < marks.length; i++) {
                    this.marks[i] = s1.marks[i];
                }
            }

            Student() {
                marks = new int[3];
                System.out.println("constructor is called...");
            }

            Student(String name) {
                this.name = name;
                marks = new int[3];
            }
        }
