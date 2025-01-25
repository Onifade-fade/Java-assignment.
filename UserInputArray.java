// 4
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers for the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nYou entered the following values:");
        for (int value : array) {
            System.out.println(value);
        }
        scanner.close();
    }
}
