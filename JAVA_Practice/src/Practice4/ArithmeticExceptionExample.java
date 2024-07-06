package Practice4;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Trying to divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        }
        System.out.println("Program continues after handling the exception.");
    }
}
