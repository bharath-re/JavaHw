package Hw2.Errors;

public class RunTimeError1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // Attempting to divide by zero
        int result = a / b; // This will cause a runtime error
        System.out.println("Result: " + result);
    }
}
// output
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Hw2.RunTimeError.main(RunTimeError.java:9)