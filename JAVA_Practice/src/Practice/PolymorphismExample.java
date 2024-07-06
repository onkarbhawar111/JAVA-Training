package Practice;

class MathOperation {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println("Sum of integers: " + math.add(5, 10));
        System.out.println("Sum of doubles: " + math.add(5.5, 10.5));
    }
}
