package Hw2.Exceptions.Checked;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// This exception is thrown when an input-output operation fails or is interrupted.
public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to read from a file
            // Thrown when an input-output operation fails or is interrupted.
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            // Handle the exception
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}
