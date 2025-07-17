public class Automobiles {
    private String Drive() {
        return "driveing vehicle";

    }
}

class Car extends Automobiles{
    protected String Drive() {
        return "Driving car"; 
    }
}

public class ElectricCar extends Car {
    @Override

    public final String Drive()
    {
        return "Driving electric car";
    }

    public static void main(String args[]) {
        final Car car = new ElectricCar();
        System.out.println(car.Drive());
    }
}