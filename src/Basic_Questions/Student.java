package Basic_Questions;

public class Student {
    private final int id;
    private final String name;

    // Constructor initializes fields
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Only getters, no setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
