package BL_JavaProgramming;
import java.util.Scanner;
class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float number1 = input.nextFloat();
        System.out.print("Enter second number: ");
        float number2 = input.nextFloat();
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        double multiplication = number1 * number2;

        double division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            division = 0;
            System.out.println("⚠ Cannot divide by zero");
        }
        System.out.println("\n--- Results ---");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (number2 != 0) {
            System.out.println("Division: " + division);
        }

        input.close();
    }
}