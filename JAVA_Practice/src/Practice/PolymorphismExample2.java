package Practice;

class Vehicle {
    public void move() {
        System.out.println("The vehicle moves.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car moves on roads.");
    }
}

public class PolymorphismExample2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.move(); // Calls the overridden method in Car class
    }
}
