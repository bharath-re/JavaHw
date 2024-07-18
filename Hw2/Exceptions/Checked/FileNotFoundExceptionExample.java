package Hw2.Exceptions.Checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// these are also known as Compile time exceptions
public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to open a file that does not exist
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            // Handle the exception
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
