// Parent Class
class AnimalClass {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class DogClass extends AnimalClass {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main Class
public class MethodOverriding {
    public static void main(String[] args) {
        AnimalClass myAnimal = new DogClass();  // Upcasting
        myAnimal.makeSound();         // Output: Dog barks
    }
}

/*
 Explanation:
Animal has a method makeSound().

Dog overrides makeSound() to give its own implementation.

At runtime, even though the reference is of type Animal, the actual method called is Dog’s version – demonstrating runtime polymorphism.
*/
