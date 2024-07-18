package Hw2.Exceptions.Unchecked;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
