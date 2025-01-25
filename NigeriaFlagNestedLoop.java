// 2b
public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int rows = 7;  // Number of rows
        int columns = 15;  // Total width of the flag

        // Using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j < columns / 3 || j >= 2 * (columns / 3)) {
                    System.out.print("G");  // Green part
                } else {
                    System.out.print("W");  // White part
                }
            }
            System.out.println();
        }
    }
}