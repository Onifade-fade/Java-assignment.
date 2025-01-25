// 1b
public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int height = 7; 
        int width = 15; 
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (j <= width / 3 || j > 2 * (width / 3)) {
                    System.out.print("G"); // Green part
                } else {
                    System.out.print("W"); // White part
                }
            }
            System.out.println();
        }
    }
}

