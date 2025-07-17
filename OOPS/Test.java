// public interface PracticeOops {
//     public static void main(String[] args) {
//         Student c = new Student();
//         c.name = " yuvraj";
//         System.out.println("user name " +c.name);
//     }
// }

// class Student {
//     String name;
//     int marks;

// }



// public class PracticeOops {

//     public static void main(String args[]) {
//         Vehical obj1 = new Car();
//         obj1.print();

//         Vehical obj2 = new Vehical();
//         obj2.print();
//     }
// }

// class Vehical {
//     void print() {
//         System.out.println("base class (vehical)");

//     }
// }

// class Car extends Vehical {
//     void Print() {
//         System.out.println("derived class(Car)");
//     }
// }

public class Test {

    static int a = 10;
    static int b;

    static void changeB() {
        a = a * 3;

    }
}

class PracticeOops {
    public static void main(String args[]) {
        Test t = new Test();
        t.changeB();
        System.out.print(Test.a + Test.b);
    }
}