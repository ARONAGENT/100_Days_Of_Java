package interfaces;

interface Vehicle {
    void start();

    default void fuelType() {
        System.out.println("Petrol or Diesel");
    }
}

interface Engine {
    static void manufacturer() {
        System.out.println("Manufactured by Honda");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuelType();
        Engine.manufacturer();// default method accessed
    }
}
