import java.util.*;
abstract class Car {
    static {
        System.out.println("1");

    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    {

   
    System.out.print("4");

}
public BlueCar(){
    super("blue");
    System.out.print("5");
}
}
    public static void main(String args[]) {
        new BlueCar();
}


