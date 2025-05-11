package Basic_Questions;

public class Animal {
    public String name;
    public String hobby;
    private int age;


    public void sound() {
        System.out.println("Animal makes a sound");
    }
    public void hobby(){
        System.out.println("Animal have hobby : Sleeping");
    }

    private void secretMethod() {
        System.out.println("Hidden");
    }
}
