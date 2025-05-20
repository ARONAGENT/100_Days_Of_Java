package Java8_Features.functional_Interfaces;

public class SayHello {
    public static void main(String[] args) {
        Greeting greeting= new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("My name is "+name);
            }
           // only valid for one method in case functional interface
        };

        greeting.sayHello("Rohan");
    }
}
