class Animal2 {
    Animal2(String name) {
        System.out.println("Animal constructor: " + name);
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        super("Dog"); // MUST explicitly call parameterized constructor
        System.out.println("Dog constructor called");
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
    }
}

/*
Output:

Animal constructor: Dog
Dog constructor called
*/