package inheritance.abstracts;
//🔚 Final Analogy:
//Imagine:
//Animal is a "rough idea"
//Dog is a "refined concept"
//Labrador is the actual pet you bring home 🐶
public class Labrador extends Dog{
    @Override
    void breedType() {

    }

    @Override
    void makeSound() {
        System.out.println("bark labro!");
    }

    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.makeSound();
        GermanShepherd germanShepherd=new GermanShepherd();
        germanShepherd.makeSound();
    }
}
