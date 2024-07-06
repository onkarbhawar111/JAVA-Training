package Practice4;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // Trying to access out-of-bound index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        }
        System.out.println("Program continues after handling the exception.");
    }
}
