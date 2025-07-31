package interfaces;

import java.util.function.Function;

class User {
    String name;

    User(String name) {
        this.name = name;
    }

    // For printing
    @Override
    public String toString() {
        return "User{name='" + name + "'}";
    }
}
public class ObjectFunctionComposition {
    public static void main(String[] args) {
        // Function to trim name
        Function<User, User> trimName = user -> {
            user.name = user.name.trim();
            return user;
        };

        // Function to convert name to uppercase
        Function<User, User> toUpperCase = user -> {
            user.name = user.name.toUpperCase();
            return user;
        };

        // Function to add prefix
        Function<User, User> addPrefix = user -> {
            user.name = "Mr. " + user.name;
            return user;
        };

        // Compose functions: trim -> uppercase -> addPrefix
        Function<User, User> formatUser = trimName
                .andThen(toUpperCase)
                .andThen(addPrefix);

        // Input user
        User user = new User("   rohan uke   ");

        // Apply composed function
        User formattedUser = formatUser.apply(user);

        // Output
        System.out.println(formattedUser);  // User{name='Mr. ROHAN UKE'}
    }
}
