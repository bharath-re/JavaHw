package HW3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileImp {
    public static void main(String[] args) {

        // Define the path to the text file
        String filePath = "/Users/BharathReddy/Desktop/JavaFile/RandomRead.txt";

        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file until the end of the file is reached
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {

            // Handle any IO exceptions that occur during file reading
            e.printStackTrace();
        }
    }
}