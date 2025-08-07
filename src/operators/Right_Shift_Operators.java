package operators;

public class Right_Shift_Operators {
    public static void main(String[] args) {
        int num = 16;
        int shifted = num >> 2;  // shifts 2 bits to right
        System.out.println("16 >> 2 = " + shifted);
        int num2 = -16;
        int shifted2= num >> 2;
        System.out.println("-16 >> 2 = " + shifted2);
    }
}
