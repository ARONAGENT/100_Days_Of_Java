package interfaces;

import java.util.function.Function;

public class FunctionComposition_demo {
    public static void main(String[] args) {
        // Define two functions
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add10 = x -> x + 10;

        int input = 5;

        // Using compose: multiplyBy2.compose(add10) → multiplyBy2(add10(5))
        int result1 = multiplyBy2.compose(add10).apply(input);
        System.out.println("Result of compose (multiplyBy2.compose(add10)): " + result1); // Output: 30

        // Using andThen: multiplyBy2.andThen(add10) → add10(multiplyBy2(5))
        int result2 = multiplyBy2.andThen(add10).apply(input);
        System.out.println("Result of andThen (multiplyBy2.andThen(add10)): " + result2); // Output: 20

        // Using identity
        Function<Integer, Integer> identity = Function.identity();
        int result3 = identity.apply(input);
        System.out.println("Result of identity function: " + result3); // Output: 5
    }
    //✅ Explanation of Output
    //Operation	Description	Output
    //multiplyBy2.compose(add10)	2 × (5 + 10)	        30
    //multiplyBy2.andThen(add10)	(2 × 5) + 10	        20
    //Function.identity()	        returns the input (5)	5
}
