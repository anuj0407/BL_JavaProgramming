package BL_JavaProgramming;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");
        System.out.println("This is a basic Java program.");
        //DataTypes 
        //primitives
        int number = 10; //4 bytes
        short smallNumber = 5; //2 bytes
        long largeNumber = 100000L; //8 bytes
        float decimalNumber = 3.14f; //4 bytes
        double largeDecimalNumber = 3.14159; //8 bytes
        char character = 'A'; //2 bytes
        boolean isTrue = true; //1 byte
        //non-primitives
        String str = "Hello, World!"; //String is a class in Java, not a primitive data type
        //literals are fixed values assigned to variables
        //output
        System.out.println("Number:" + number + ", Small Number: " + smallNumber + ", Large Number: " + largeNumber);
        System.out.println("Decimal Number: " + decimalNumber + ", Large Decimal Number: " + largeDecimalNumber);
        System.out.println("Character: " + character + ", Is True: " + isTrue);
        System.out.println("String: " + str);
        // operators
        //Arithmetic Operators: +, -, *, /, %
        int a = 5;
        int b = 3;
        int addition = a + b; // addition
        int Subtraction = a - b; // subtraction
        int multiplication = a * b; // multiplication
        int modulo = a % b; // modulo
        double division = (double) a / b; // division
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + Subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
        //Comparison Operators: ==, !=, >, <, >=, <=
        boolean isEqual = (a == b); // false
        boolean isNotEqual = (a != b); // true
        boolean isGreater = (a > b); // true
        boolean isLess = (a < b); // false
        boolean isGreaterOrEqual = (a >= b); // true
        boolean isLessOrEqual = (a <= b); // false
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less or Equal: " + isLessOrEqual);
        //Logical Operators: &&, ||, !
        boolean condition1 = true;
        boolean condition2 = false;
        boolean and = condition1 && condition2; // false
        boolean or = condition1 || condition2; // true
        boolean not = !condition1; // false
        System.out.println("Logical AND: " + and);
        System.out.println("Logical OR: " + or);
        System.out.println("Logical NOT: " + not);
        //Assignment Operators: =, +=, -=, *=, /=, %=
        int c = 10;
        c += 5; // c = c + 5; c is now 15
        c -= 3; // c = c - 3; c is now 12
        System.out.println("Value of c after addition and subtraction: " + c);
        //operands are the values on which operators perform operations..

    }
}
