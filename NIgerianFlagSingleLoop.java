// 2a
public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int rows = 7;  // Number of rows
        int columns = 15;  // Total width of the flag

        // Using a single loop
        for (int i = 0; i < rows; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < columns; j++) {
                if (j < columns / 3 || j >= 2 * (columns / 3)) {
                    row.append("G");  // Green part
                } else {
                    row.append("W");  // White part
                }
            }
            System.out.println(row);
        }
    }
}
