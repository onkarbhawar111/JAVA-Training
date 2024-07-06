package Practice;

abstract class Shape {
    abstract void draw();

    public void description() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.description();
    }
}
