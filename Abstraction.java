abstract class AnimalCls {
    abstract void makeSound(); // Abstract method

    void eat() { // Concrete method
        System.out.println("This animal eats food.");
    }
}

class DogCls extends AnimalCls {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Abstraction {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ❌ Error: cannot instantiate abstract class
        AnimalCls myDog = new DogCls();  // ✅ Polymorphism
        myDog.makeSound();         // Output: Dog barks
        myDog.eat();               // Output: This animal eats food.
    }
}

