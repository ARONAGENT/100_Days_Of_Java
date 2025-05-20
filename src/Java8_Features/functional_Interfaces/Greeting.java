package Java8_Features.functional_Interfaces;
@FunctionalInterface
public interface Greeting {
    void sayHello(String name); // only one abstract method allowed
    // void sayHi(String hiMsg); // not allowed another abstract method
}
