package dsa_Questions;

public sealed class Animal permits Dog, Cat {
    public void speak() {
        System.out.println("Animal sound");
    }
}

final class Dog extends Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}

non-sealed class Cat extends Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}
//3. Permitted Subclass Types:
//A class extending a sealed class must be:
//final → no one can extend it
//sealed → extendable but still restricted
//non-sealed → can be extended by anyone (removes restriction)
//4. Why use it?
//For security, clarity, and maintainability
//You control your class hierarchy
//Alternative to enum when you need more flexibility

/**
 * 4. Why use it?
 * For security, clarity, and maintainability
 * You control your class hierarchy
 * Alternative to enum when you need more flexibility
 */