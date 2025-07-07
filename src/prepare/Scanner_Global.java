package prepare;

import java.util.Scanner;
//🧾 Day 63: Used Global Scanner in Java and Created Function to Add Numbers from User Input

public class Scanner_Global {
   static Scanner scanner=new Scanner(System.in);
    public static int add(){
        int a=scanner.nextInt();
        int b=scanner.nextInt();
    return a+b;
    }
    public static int sub(){
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        return a-b;
    }
    public static void main(String[] args) {
        int val=add();
        System.out.println(val);
        int val2=sub();
        System.out.println(val2);
    }
}
