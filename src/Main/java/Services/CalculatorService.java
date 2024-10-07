package Services;

    // Addition of Two Number
public class CalculatorService {
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }

    // Subtraction of Two Number
    public static int subtractTwoNumbers(int a, int b){
        return a-b;
    }

    // Multiplication of Two Number
    public static int productTwoNumbers(int a, int b){
        return a*b;
    }

    public static double divideTwoNumbers(int a, int b){
        return (float)(a/b);
    }


    public static int sumAnyNumbers(int ...numbers) {
        int s=0;
        for(int n : numbers){
            s+=n;
        }
        return s;
    }
}
