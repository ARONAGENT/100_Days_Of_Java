package Basic_Questions;

public class CarsObject {
    public static void main(String[] args) {
        Cars car1 = new Cars("BMW", 2022);
        Cars car2 = new Cars("BMW", 2022);

        car1.show();
        car2.show();

        System.out.println(car1 == car2);         // false
        System.out.println(car1.equals(car2));    // true ✅
    }
}
