package Hw2.Exceptions.Unchecked;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            // Handle the exception
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}
