package HW3;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class BinaryRead {
    public static void main(String[] args) {
        String filePath ="/Users/BharathReddy/Desktop/JavaFile/BinaryRead.bin";

        try (FileInputStream fis = new FileInputStream(filePath);
             DataInputStream dis = new DataInputStream(fis)) {

            // Read data from the file
            while (dis.available() > 0) {
                int data = dis.readInt(); // Example: reading an integer
                System.out.println("Read int: " + data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
