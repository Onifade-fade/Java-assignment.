// 5
import java.util.Scanner;

public class TwoDArrayInputOutput {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for a 10x10 array:");
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nYou entered the following values:");
        for (int[] row : array) { 
            for (int value : row) { 
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}
