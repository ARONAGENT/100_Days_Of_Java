package Basic_Questions;

import java.util.Objects;
//🧠 Hinglish:
//equals() ko override karna zaroori hota hai agar aapko do objects ka data compare karna hai.
//Java ka default .equals() sirf memory address compare karta hai.
//Hamne brand aur year ko compare kiya, jisse do cars ka actual content match kiya jaa sake.
public class Cars {
    private String brand;
    private int year;

    public Cars(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void show() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false; // different class

        Cars cars = (Cars) obj;
        return year == cars.year && Objects.equals(brand, cars.brand) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year);
    }
}
