package Basic_Questions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 🔸 Principal amount = ₹10000.50
        BigDecimal principal = new BigDecimal("10000.50");

        // 🔸 Annual interest rate = 5.5%
        BigDecimal rate = new BigDecimal("0.055");

        // 🔸 Time = 3 years
        int time = 3;

        // 🔸 Compound interest formula: A = P * (1 + r)^t
        BigDecimal onePlusRate = BigDecimal.ONE.add(rate);  // (1 + r)
        BigDecimal amount = principal.multiply(onePlusRate.pow(time));  // A = P * (1 + r)^t

        // 🔸 Round to 2 decimal places (for currency format)
        amount = amount.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Amount after " + time + " years = ₹" + amount);
    }
}
