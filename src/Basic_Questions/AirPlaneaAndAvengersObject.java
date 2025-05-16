package Basic_Questions;

public class AirPlaneaAndAvengersObject {
    public static void main(String[] args) {
        // Creating two separate Airplane objects with the same value
        Airplane airplane = new Airplane("max speed");
        Airplane airplane1 = new Airplane("max speed");

        // Printing their hashCodes
        // Even though they are different objects, if you've overridden hashCode(),
        // and both have the same field values, they will return the same hash code.
        System.out.println(airplane.hashCode());
        System.out.println(airplane1.hashCode());

        // This will return true if you've overridden equals() in Airplane class
        // and compared the values inside (e.g., model).
        System.out.println(airplane.equals(airplane1));
        // ✅ TRUE — Because you manually defined how two Airplane objects should be equal.

        // Creating two Avengers objects with same value but equals() is NOT overridden
        Avengers avengers = new Avengers("IronMan");
        Avengers avengers1 = new Avengers("IronMan");

        // Since equals() is not overridden in Avengers, this uses Object's equals(),
        // which checks reference equality (==), so it returns false.
        System.out.println(avengers.equals(avengers1));
        // ❌ FALSE — because two different object references are being compared.

        // HashCodes might still be different unless hashCode() is overridden in Avengers.
        System.out.println(avengers.hashCode());
        System.out.println(avengers1.hashCode());
    }
}
