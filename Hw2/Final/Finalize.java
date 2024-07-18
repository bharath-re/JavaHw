package Hw2.Final;

public class Finalize {
    // Method to display a message when the object is finalized
    public void finalize() {
        System.out.println("Finalize method called.");
    }

    public static void main(String[] args) {
        // Create an object of FinalizeExample
        Finalize obj = new Finalize();

        // Making the object eligible for garbage collection
        obj = null;

        // Requesting garbage collection (optional)
        System.gc();

        // Output message to indicate end of program
        System.out.println("End of main method.");
    }
}
