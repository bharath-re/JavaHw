package HW3.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

//Serialization is the process of converting an object into a format that can be easily stored, transmitted,
// or reconstructed later in its original form.
public class SerializationExample {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30);

        // Serialize the Person object
        try (FileOutputStream fos = new FileOutputStream("person.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
