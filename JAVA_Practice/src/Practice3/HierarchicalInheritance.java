package Practice3;

class Animal1 {
    void eat() {
        System.out.println("This Animal1 eats food.");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("The Dog1 barks.");
    }
}

class Cat extends Animal1 {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog1 Dog1 = new Dog1();
        Dog1.eat();  // Inherited method
        Dog1.bark(); // Method of Dog1 class

        Cat cat = new Cat();
        cat.eat();  // Inherited method
        cat.meow(); // Method of Cat class
    }
}
