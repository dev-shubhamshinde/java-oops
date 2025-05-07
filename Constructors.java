// Class with multiple constructors
public class Constructors {
    String name;
    int id;

    // Default Constructor
    public Constructors() {
        name = "Unknown";
        id = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized Constructor
    public Constructors(String empName, int empId) {
        name = empName;
        id = empId;
        System.out.println("Parameterized constructor called");
    }

    // Display method
    public void display() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        // Using default constructor
        Constructors emp1 = new Constructors();
        emp1.display();
        // Using parameterized constructor
        Constructors emp2 = new Constructors("Alice", 101);
        emp2.display();
    }
}


/*Output:
Default constructor called
Employee Name: Unknown, ID: 0

Parameterized constructor called
Employee Name: Alice, ID: 101
*/