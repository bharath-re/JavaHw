package Hw2.Final;

class Divide{
    public int divideNumbs(int a, int b){
        return a/b;
    }
}

public class Finally {
    public static void main(String[] args) {
        Divide d=new Divide();

        try {
            // Attempt to perform division with 10 and 0 (which will cause an ArithmeticException)
            int result = d.divideNumbs(10, 0);
            System.out.println(result); // This line will not be executed due to the exception
        } catch (ArithmeticException e) {
            // Catch block executes when an ArithmeticException is thrown
            System.out.println("Divided by Zero by exception " + e); // Print error message and exception details
        } finally {
            // Finally block executes regardless of whether an exception occurred or not
            System.out.println("Finally Block is executed"); // Print a message indicating the finally block execution
        }




    }
}
