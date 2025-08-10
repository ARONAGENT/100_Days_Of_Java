package operators;

public class BitwiseAnd_Operator {

    public static void main(String[] args) {

        // Array of example pairs
        int[][] examples = {
                {5, 3}, {6, 5}, {12, 10}, {15, 7}, {9, 1},
                {7, 7}, {8, 2}, {255, 127}, {100, 50}, {13, 9},
                {19, 8}, {45, 25}, {99, 65}, {77, 33}, {144, 72},
                {56, 28}, {31, 15}, {29, 14}, {200, 100}, {150, 75}
        };

        System.out.printf("%-10s %-10s %-10s %-15s %-15s %-15s\n",
                "A(dec)", "B(dec)", "Result", "A(bin)", "B(bin)", "Result(bin)");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int[] pair : examples) {
            int a = pair[0];
            int b = pair[1];
            int result = a & b;
            System.out.printf("%-10d %-10d %-10d %-15s %-15s %-15s\n",
                    a, b, result,
                    String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'),
                    String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'),
                    String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0')
            );
        }
    }
}
