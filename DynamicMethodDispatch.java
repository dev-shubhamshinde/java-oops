class ClassAnimal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class ClassDog extends ClassAnimal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class ClassCat extends ClassAnimal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        ClassAnimal a; // reference of superclass

        a = new ClassDog(); // Dog object
        a.sound();     // Output: Dog barks

        a = new ClassCat(); // Cat object
        a.sound();     // Output: Cat meows
    }
}
/*
Explanation:
The reference variable a is of type Animal, but at runtime it refers to objects of Dog and Cat.

Even though the reference type is Animal, the overridden sound() method in Dog or Cat is invoked, depending on the actual object.

This behavior is dynamic dispatch – the method that gets called is determined during program execution, not at compile time.
*/