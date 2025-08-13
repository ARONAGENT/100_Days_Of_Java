package operators;

public class BitWise_NOT {
    // Bitwise NOT (~) Basics
    //Flips every bit:
    //0 → 1
    //1 → 0

    //Formula:
    //~x = -x - 1
    public static void main(String[] args) {
        System.out.println("~5 = " + (~5));   // -6
        System.out.println("~0 = " + (~0));   // -1
        System.out.println("~1 = " + (~1));   // -2
        System.out.println("~-1 = " + (~-1)); // 0
        System.out.println("~10 = " + (~10)); // -11
    }
}
