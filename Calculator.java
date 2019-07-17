import java.util.Scanner;

public class Calculator {
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    static int subtraction(int a, int b) {
        int c = a - b;
        return c;
    }

    static int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }

    static float division(float a, float b) {
        float c = a / b;
        return c;
    }

    static double pow(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first value:");
        int firstValue = in.nextInt();
        System.out.print("Enter second value:");
        int secondValue = in.nextInt();
        System.out.print("Enter operation(+,-,*,/,^):");
        String operation = in.next();

        switch (operation) {
            case "+":
                System.out.print("Result is:" + sum(firstValue, secondValue));
                break;
            case "-":
                System.out.print("Result is:" + subtraction(firstValue, secondValue));
                break;
            case "*":
                System.out.print("Result is:" + multiplication(firstValue, secondValue));
                break;
            case "/":
                System.out.print("Result is:" + division(firstValue, secondValue));
                break;
            case "^":
                System.out.print("Result is:" + pow(firstValue, secondValue));
                break;
        }
    }
}
