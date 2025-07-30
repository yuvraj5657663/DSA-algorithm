package Interface;
interface Animal {
    void sound();

    default void sleep(){
        System.out.println("sleeping.....");
    }

}

class Dog implements Animal {
  public void sound() {
        System.out.println("dog barks....");
    }
}


public class Interface {
    public static void main(String[] args) {
        Dog d  = new Dog();
        d.sound();
        d.sleep();
    }
}
