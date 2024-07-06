package Practice2;

public class Person2 {
    private String name;
    private int age;

    // Default constructor
    public Person2() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person2(String name) {
        this.name = name;
        this.age = 0;
    }

    // Parameterized constructor
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person2 Person21 = new Person2();
        Person21.display();

        Person2 Person22 = new Person2("John");
        Person22.display();

        Person2 Person23 = new Person2("Jane", 30);
        Person23.display();
    }
}
