package BL_JavaProgramming;
import java.util.Scanner;
class AreaOfTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        float baseInCm = input.nextFloat();
        System.out.print("Enter height: ");
        float heightInCm = input.nextFloat();
        double areaInCmSquare = (1/2.0) * baseInCm * heightInCm ;
        double baseInInches = baseInCm / 2.54;
        double heightInInches = heightInCm / 2.54;
        double areaInInchesSquare = (1/2.0) * baseInInches * heightInInches ;
        System.out.println("Area of triangle is " + areaInCmSquare + " in cm^2 " +  areaInInchesSquare + " in inches^2");
        input.close();
    }
}