package Assignment6_Overloading;

public class AddNumbers {
    // Method to add two integers
    public AddNumbers(int a, int b) {
        System.out.println(a + b);
    }

    // Overloaded method to add three integers
    public AddNumbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Overloaded method to add two double values
    public AddNumbers(double a, double b) {
        System.out.println(a + b);
    }

    // Overloaded method to add three double values
    public AddNumbers(double a, double b, double c) {
        System.out.println(a + b + c);
    }

}