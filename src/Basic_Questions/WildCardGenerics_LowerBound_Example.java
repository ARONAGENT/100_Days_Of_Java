package Basic_Questions;

import java.util.ArrayList;
import java.util.List;
// When to Use
//<?> → when you don’t care about type.
//<? extends T> → when you only need to read values.
//<? super T> → when you only need to write values.
public class WildCardGenerics_LowerBound_Example {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i); // safe because Integer is allowed
        }
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        addNumbers(numList);

        System.out.println(numList); // [1, 2, 3, 4, 5]
    }
}
