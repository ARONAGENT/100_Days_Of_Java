package operators;

public class Example_Practices_INC_DEC {
    public static void main(String[] args) {
        // Q1
        int a1 = 5;
        int b1 = a1++;
        System.out.println("Q1: " + b1); // 5

        // Q2
        int a2 = 5;
        int b2 = ++a2;
        System.out.println("Q2: " + b2); // 6

        // Q3
        int x3 = 10;
        x3 = x3++;
        System.out.println("Q3: " + x3); // 10

        // Q4
        int x4 = 5;
        int y4 = x4++ + ++x4;
        System.out.println("Q4: " + y4); // 12

        // Q5
        int a5 = 1;
        int b5 = a5++ + a5++ + a5;
        System.out.println("Q5: " + b5); // 6

        // Q6
        int x6 = 3;
        int y6 = ++x6 + ++x6 + x6++;
        System.out.println("Q6: " + y6); // 14

        // Q7
        int a7 = 5;
        int b7 = a7++ - ++a7;
        System.out.println("Q7: " + b7); // -2

        // Q8
        int a8 = 7;
        int b8 = ++a8 + ++a8;
        System.out.println("Q8: a=" + a8 + ", b=" + b8); // a=9, b=17

        // Q9
        int x9 = 5;
        System.out.println("Q9: " + (x9++ + x9++)); // 11

        // Q10
        int x10 = 5;
        System.out.println("Q10: " + (++x10 + ++x10)); // 13

        // Q11
        int a11 = 1, b11 = 2;
        int c11 = ++a11 * b11++;
        System.out.println("Q11: " + c11); // 4

        // Q12
        int i12 = 0;
        i12 = i12++ - --i12 + ++i12;
        System.out.println("Q12: " + i12); // 1

        // Q13
        int x13 = 10;
        int y13 = x13++ + x13++ + ++x13;
        System.out.println("Q13: " + y13); // 34

        // Q14
        int a14 = 2, b14 = 3;
        int result14 = a14++ * ++b14 + b14++ * ++a14;
        System.out.println("Q14: " + result14); // 24

        // Q15
        int x15 = 1;
        x15 = x15++ + ++x15 * x15++;
        System.out.println("Q15: " + x15); // 10

        // Q16
        int x16 = 5;
        System.out.println("Q16: " + (++x16 + x16++ + x16)); // 19

        // Q17
        int a17 = 10;
        System.out.println("Q17: " + (++a17 - a17++ + --a17)); // 11

        // Q18
        int i18 = 1;
        int result18 = i18++ + ++i18 + i18++ + ++i18;
        System.out.println("Q18: " + result18); // 12

        // Q19
        int a19 = 3, b19 = 4;
        int c19 = a19++ + ++b19 - --a19 + b19--;
        System.out.println("Q19: " + c19); // 10

        // Q20
        int x20 = 5;
        x20 = ++x20 + x20++ + ++x20;
        System.out.println("Q20: " + x20); // 20
    }
    }
