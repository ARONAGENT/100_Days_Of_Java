package Basic_Questions;

public class VarargsDemo {
    public static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers();                    // 0 args
        printNumbers(5);                   // 1 arg
        printNumbers(1, 2, 3, 4, 5, 6);    // multiple args
    }
    //🧠 Hinglish Explanation:
    //Jab aapko ek method mein unknown number of arguments bhejne hote hain, tab varargs use karte hain. Ye internally ek array jaise kaam karta hai.
    //Jaise ki: printNumbers(1, 2, 3, 4) — aapko alag-alag overloads banane ki zarurat nahi hoti.
}
