package BL_JavaProgramming;

public class Loops {
    public static void main(String[] args) {
        //for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        //while loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        //do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);

        //nested loops
        System.out.println("\nNested Loops:");
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 2; n++) {
                System.out.println("Outer Loop: " + m + ", Inner Loop: " + n);
            }
        }
    }
}
