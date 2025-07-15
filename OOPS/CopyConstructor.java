public class CopyConstructor {
    
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "yuvraj";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy constructor (deep copy)
        s2.password = "dasf";

        s1.marks[2] = 100; // will NOT affect s2 now

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

    Student() {
        System.out.println("constructor is called...");
        marks = new int[3];
    }

    Student(String name) {
        this.name = name;
        marks = new int[3];
    }

    // Deep Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
