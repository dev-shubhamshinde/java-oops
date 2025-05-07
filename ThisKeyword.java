class Student {
    String name;
    int age;

    // Constructor with parameters
    Student(String name, int age) {
        this.name = name;  // 'this.name' = instance variable, 'name' = parameter
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.display();
    }
}