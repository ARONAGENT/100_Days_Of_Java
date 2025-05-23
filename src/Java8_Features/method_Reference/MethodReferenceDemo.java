package Java8_Features.method_Reference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void printItem(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Sita", "Geeta");

        // Using lambda
        names.forEach(name -> printItem(name));

        // Using method reference
        names.forEach(MethodReferenceDemo::printItem);
    }
}
