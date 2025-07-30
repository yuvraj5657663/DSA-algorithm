abstract class Animal {
    abstract void sound(); // abstract method declare 

    void sleep() {
        System.out.println("sleeping.....");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("barks");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep(); // 
        d.sound();
    }
}