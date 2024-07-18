package HW3;


import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BinaryWrite {
    public static void main(String[] args) {
        String filePath = "/Users/BharathReddy/Desktop/JavaFile/BinaryRead.bin";

        try (FileOutputStream fos = new FileOutputStream(filePath);
             DataOutputStream dos = new DataOutputStream(fos)) {

            // Write data to the file
            dos.writeInt(42);        // Example: writing an integer
            dos.writeDouble(3.14);   // Example: writing a double
            dos.writeUTF("Hello");   // Example: writing a string in UTF format

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
