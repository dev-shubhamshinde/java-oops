class Animal1 {
    Animal1() {
        System.out.println("Animal constructor called");
    }
}

class Dog1 extends Animal1 {
    Dog1() {
        super(); // optional here because Animal has a default constructor
        System.out.println("Dog constructor called");
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
    }
}

/*
🧾 Output:
Animal constructor called
Dog constructor called

✅ What happened:
Dog object is created.
Before executing Dog() constructor, Animal() is automatically called.
Then Dog() constructor runs.
 */