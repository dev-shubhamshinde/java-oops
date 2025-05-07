// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

// Main class to test
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited method
        d.bark(); // Child class method
    }
}
