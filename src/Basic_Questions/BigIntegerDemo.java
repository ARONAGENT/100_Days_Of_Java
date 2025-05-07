package Basic_Questions;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        int num = 100; // Factorial of 100
        BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + num + " is:");
        System.out.println(fact);
    }
}
