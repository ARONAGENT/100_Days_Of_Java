package Basic_Questions;

public class StringOperationsDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // 1️⃣ Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // 2️⃣ Length of string
        System.out.println("Length: " + result.length());

        // 3️⃣ Character at index
        System.out.println("Char at index 1: " + result.charAt(1));

        // 4️⃣ Substring
        System.out.println("Substring (0, 5): " + result.substring(0, 5));

        // 5️⃣ Contains
        System.out.println("Contains 'lo': " + result.contains("lo"));

        // 6️⃣ Equals and equalsIgnoreCase
        System.out.println("Equals 'Hello World': " + result.equals("Hello World"));
        System.out.println("EqualsIgnoreCase 'hello world': " + result.equalsIgnoreCase("hello world"));

        // 7️⃣ Replace characters
        System.out.println("Replace 'l' with 'x': " + result.replace('l', 'x'));

        // 8️⃣ Index of character
        System.out.println("Index of 'W': " + result.indexOf('W'));

        // 9️⃣ To Upper/Lower Case
        System.out.println("UpperCase: " + result.toUpperCase());
        System.out.println("LowerCase: " + result.toLowerCase());

        // 🔟 Trim spaces
        String strWithSpaces = "  Java  ";
        System.out.println("Before Trim: '" + strWithSpaces + "'");
        System.out.println("After Trim: '" + strWithSpaces.trim() + "'");

        // 1️⃣1️⃣ isEmpty & isBlank
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is Empty: " + emptyStr.isEmpty());
        System.out.println("Is Blank: " + blankStr.isBlank());

        // 1️⃣2️⃣ Split
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        System.out.print("Split result: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
