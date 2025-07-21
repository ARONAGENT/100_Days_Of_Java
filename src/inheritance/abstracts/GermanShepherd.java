package inheritance.abstracts;

abstract class Animal {
    abstract void makeSound();
    void eat() {
        System.out.println("Eating...");
    }
}

abstract class Dog extends Animal {
    abstract void breedType(); // additional abstract method
    // makeSound() is not implemented yet
}

class GermanShepherd extends Dog {
    void makeSound() {
        System.out.println("Bark german");
    }
    void breedType() {
        System.out.println("Large working dog breed.");
    }
}