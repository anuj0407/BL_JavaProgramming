package BL_JavaProgramming;

public class Conditional {
    public static void main(String[] args) {
        //if-else statement
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        //nested if statement
        int age = 25;   
        if (age >= 18) {
            if (age < 65) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a senior citizen.");
            }
        } else {
            System.out.println("You are a minor.");
        }

        //ladder if statement
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        //ternary operator
        int num1 = 5;
        int num2 = 10;  
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum number is: " + max);

        //switch statement
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }
    }
}
