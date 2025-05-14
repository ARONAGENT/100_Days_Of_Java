package Basic_Questions;

public class Mango {

    int quantity=5;
    private String type="Hapus";
    public Mango(){
        System.out.println("This is Mongo class");
    }
    public Mango(String taste){
        System.out.println("Mango taste is "+taste);

    }
    public void show() {
        System.out.println("Hello from show() from Mango class ");
    }


}
