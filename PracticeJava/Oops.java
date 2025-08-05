public class Oops {
    public static void main(String[] args) {
        student s0 = new student("yuvraj");
        System.out.println(s0.name);

        Student s1 = new Student();
        Student s2 = new Student(124);
        Student s3 = new Student("yuvraj singh");

    }
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.println("contructor is empty called");
        
    }

    Student(String name){
        this.name = name;
        System.out.println("contructor is name called");
    }

    Student (int roll){
        this.roll = roll;
        System.out.println("contructor is roll called");
    }
}

class student {
    String name;
    int roll;

    student(String name) {
        System.out.println("contructor is called ");
        this.name = name;
    }
}