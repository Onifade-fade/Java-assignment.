// 5
import java.util.Scanner;

public class TwoDArrayInputOutput {
    public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Part a: Assign elements to the 2D array using user input
        System.out.println("Enter values for a 10x10 array:");
        for (int i = 0; i < array.length; i++) { // Outer loop for rows
            for (int j = 0; j < array[i].length; j++) { // Inner loop for columns
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Part b: Print out the 2D array using a for-each loop
        System.out.println("\nYou entered the following values:");
        for (int[] row : array) { // Iterate over rows
            for (int value : row) { // Iterate over values in each row
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }

        scanner.close();
    }
}