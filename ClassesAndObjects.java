// Class definition
public class ClassesAndObjects {
    // Fields (Attributes)
    String color;
    String model;
    int year;

    // Method (Behavior)
    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of the Car class
        ClassesAndObjects myCar = new ClassesAndObjects();

        // Assigning values to the object's fields
        myCar.color = "Red";
        myCar.model = "Toyota Corolla";
        myCar.year = 2020;
        // Calling a method using the object
        myCar.displayInfo();
    }
}
/*
Explanation:
        •	Class Name: Car is the class that defines the structure of a car.
        •	Attributes: color, model, and year define the state of the car.
        •	Method: displayInfo() prints the car's information.
        •	Object Creation: Car myCar = new Car(); creates a new object of the class.
        •	Field Assignment: myCar.color = "Red"; assigns a value to the field.
*/