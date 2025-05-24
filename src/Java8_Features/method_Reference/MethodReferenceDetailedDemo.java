package Java8_Features.method_Reference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
/**
 * ✅ Explanation Recap in Comments:
 * Method Reference Type	Example Used	        Functional Interface
 * Static Method	        Utils::square	        Function<Integer, Integer>
 * Instance Method (object)	 utilsObj::printMessage	Consumer<String>
 * Instance Method (class)	String::toUpperCase	    Function<String, String>
 * Constructor	             Car::new	            Supplier<Car> and Function<String, Car>
 */

// A simple class with various methods
class Utils {
    public static int square(int num) {
        return num * num;
    }

    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public String toUpper(String str) {
        return str.toUpperCase();
    }
}

class Car {
    String brand;

    public Car() {
        this.brand = "Default";
    }

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car Brand: " + brand;
    }
}

public class MethodReferenceDetailedDemo {
    public static void main(String[] args) {

        // 1️⃣ Reference to a Static Method
        // Lambda version: Function<Integer, Integer> func = n -> Utils.square(n);
        Function<Integer, Integer> squareRef = Utils::square;
        System.out.println("Square of 5 is: " + squareRef.apply(5));


        // 2️⃣ Reference to an Instance Method of a Particular Object
        Utils utilsObj = new Utils();
        // Lambda version: Consumer<String> printer = msg -> utilsObj.printMessage(msg);
        Consumer<String> printer = utilsObj::printMessage;
        printer.accept("Hello from instance method!");


        // 3️⃣ Reference to an Instance Method of an Arbitrary Object of a Particular Type
        // Works for instance method like toUpperCase of String class
        Function<String, String> upperFunc = String::toUpperCase;
        System.out.println("Uppercase: " + upperFunc.apply("java"));


        // 4️⃣ Reference to a Constructor
        // Lambda version: Supplier<Car> carSupplier = () -> new Car();
        Supplier<Car> carSupplier = Car::new;
        Car newCar = carSupplier.get();
        System.out.println(newCar);

        // Constructor reference with parameters
        // Lambda version: Function<String, Car> carMaker = brand -> new Car(brand);
        Function<String, Car> carMaker = Car::new;
        Car honda = carMaker.apply("Honda");
        System.out.println(honda);
    }
}

