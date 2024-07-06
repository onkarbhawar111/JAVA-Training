package Practice2;


public class Person1 {
    private String name;
    private int age;

    // Parameterized constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person1 person1 = new Person1("John", 25);
        person1.display();

        Person1 person2 = new Person1("Jane", 30);
        person2.display();
    }
}
