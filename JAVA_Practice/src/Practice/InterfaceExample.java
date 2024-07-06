package Practice;

interface Animal1 {
    void makeSound();
}

class Cat implements Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal1 animal = new Cat();
        animal.makeSound();
    }
}
