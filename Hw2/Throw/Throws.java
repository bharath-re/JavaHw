package Hw2.Throw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throws {
    // Method to read a file and declare that it might throw FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            // Call the readFile method and handle the possible exception
            readFile("example.txt");
        } catch (FileNotFoundException e) {
            // Handle the exception
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println("End of main method.");
    }
}
