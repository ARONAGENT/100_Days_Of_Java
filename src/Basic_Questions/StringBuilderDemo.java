package Basic_Questions;

public class StringBuilderDemo {
    public static void main(String[] args) {

        // 🔸 1. Create a new StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 🔸 2. Append another string
        sb.append(" World"); // Adds " World" to "Hello"
        System.out.println("After append: " + sb);

        // 🔸 3. Insert a string at specific index
        sb.insert(5, ","); // Inserts "," at index 5
        System.out.println("After insert: " + sb);

        // 🔸 4. Replace characters from index 0 to 5
        sb.replace(0, 5, "Hi"); // Replaces "Hello" with "Hi"
        System.out.println("After replace: " + sb);

        // 🔸 5. Delete characters from index 2 to 4
        sb.delete(2, 4); // Deletes characters between index 2 and 4
        System.out.println("After delete: " + sb);

        // 🔸 6. Reverse the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 🔸 7. Convert StringBuilder to String
        String result = sb.toString();
        System.out.println("Converted to String: " + result);

        // 🔸 8. Capacity of StringBuilder
        StringBuilder capTest = new StringBuilder(); // Default capacity = 16
        System.out.println("Initial capacity: " + capTest.capacity());
        capTest.append("JavaIsAwesome");
        System.out.println("After append: " + capTest.capacity());

        // 🔸 9. Set a specific character
        capTest.setCharAt(0, 'j');
        System.out.println("After setCharAt: " + capTest);

        // 🔸 10. Length of content
        System.out.println("Length: " + capTest.length());
    }
}
