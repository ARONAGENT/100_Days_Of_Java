package Basic_Questions;

import java.util.Arrays;
import java.util.List;

public class WildCardGenericsUpperBounded_Example {
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("Sum of Integers: " + sumOfList(intList));
        System.out.println("Sum of Doubles: " + sumOfList(doubleList));
    }
}
