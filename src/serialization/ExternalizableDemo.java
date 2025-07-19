package serialization;

import java.io.*;

public class ExternalizableDemo {
    public static void main(String[] args) {
        String filename = "user.ser";

        // Serialize object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            User user = new User("Rohan", 21);
            oos.writeObject(user);
            System.out.println("✅ Object has been serialized."+user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            User user = (User) ois.readObject();
            System.out.println("✅ Object has been deserialized.");
            System.out.println("User name: " + user.name + ", Age: " + user.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }

