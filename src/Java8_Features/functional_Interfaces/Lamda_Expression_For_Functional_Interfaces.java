package Java8_Features.functional_Interfaces;
/*
 * ✅ Lambda Expression with Functional Interface
 *
 * Format of Lambda Expression:
 *   InterfaceName obj = (parameter) -> {
 *       // method body
 *   };
 *
 * - The '->' symbol is called the **Lambda Operator** (Arrow Operator).
 * - It is used to separate the parameters and the body of the lambda.
 * - Works only with Functional Interfaces (interface with ONE abstract method).
 */
public class Lamda_Expression_For_Functional_Interfaces {

    public static void main(String[] args) {
        Greeting greeting= (name) -> System.out.println("My name is "+name);
         greeting.sayHello("rohan");
    }

//    💡 Hinglish Explanation:
//    Functional Interface ka matlab hota hai ek aisa interface jisme sirf ek abstract method ho.
//    Aur Lambda Expression us method ko implement karne ka ek short aur clean way hai — bina extra class banaye.
}
