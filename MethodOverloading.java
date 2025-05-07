public class MethodOverloading {
    // Method with one parameter
    public void show(int a) {
        System.out.println("Integer: " + a);
    }

    // Overloaded method with different type
    public void show(String s) {
        System.out.println("String: " + s);
    }

    // Overloaded method with different number of parameters
    public void show(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.show(10);           // Output: Integer: 10
        obj.show("Java");       // Output: String: Java
        obj.show(5, 15);        // Output: Sum: 20
    }
}