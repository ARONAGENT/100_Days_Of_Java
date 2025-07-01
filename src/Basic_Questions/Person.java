import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Person{
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // ✅ Override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    // ✅ Override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
/*
In summary: If you override the equals() method in a custom class, 
you must also override the hashCode() method to maintain the contract, 
ensuring that equal objects have equal hash codes. 
Failing to do so can lead to unexpected and incorrect behavior, 
particularly when using objects in hash-based collections
*/