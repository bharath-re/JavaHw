package Hw2.Throw;


public class ThrowImp {
    public static void checkPositive(int number) {
        if (number < 0) {
            // Throw an IllegalArgumentException if the number is negative
            throw new IllegalArgumentException("Number must be positive.");
        } else {
            System.out.println("Number is positive.");
        }
    }

    public static void main(String[] args) {
        try {
            checkPositive(-5); // This will throw an exception
        } catch (IllegalArgumentException e) {
            // Handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("End of main method.");
    }
}


