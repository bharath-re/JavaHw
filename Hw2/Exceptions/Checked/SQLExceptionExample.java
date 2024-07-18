package Hw2.Exceptions.Checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        // Database URL, username and password (assuming these are incorrect)
        String url = "jdbc:mysql://localhost:3306/nonexistentdb";
        String username = "wronguser";
        String password = "wrongpassword";

        // Attempt to connect to the database
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully.");
        } catch (SQLException e) {
            // Handle the SQLException
            System.out.println("SQLException occurred: " + e.getMessage());
        }

        System.out.println("End of main method.");
    }
}
