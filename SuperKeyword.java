class Animal3 {
    String name = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog3 extends Animal3 {
    String name = "Dog";

    void sound() {
        System.out.println("Dog barks");
    }

    void printDetails() {
        System.out.println("This class name: " + name);        // Dog's name
        System.out.println("Super class name: " + super.name); // Animal's name

        sound();        // Calls Dog's sound()
        super.sound();  // Calls Animal's sound()
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.printDetails();
    }
}