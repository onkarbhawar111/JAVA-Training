package Practice4;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // Trying to invoke a method on a null object
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        }
        System.out.println("Program continues after handling the exception.");
    }
}
