package Hw2.Errors;

public class LogicalError {
    public static void main(String[] args) {
        int number = 5;

        // Incorrect logic for checking if a number is even
        if (number % 2 == 1) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

// Output Shows 5 is even but its not so we have Logical Errors
