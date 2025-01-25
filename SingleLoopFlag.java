// 1a
public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int height = 7; 
        int width = 15; 
        for (int i = 1; i <= height; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= width; j++) {
                if (j <= width / 3 || j > 2 * (width / 3)) {
                    row.append("G"); 
                } else {
                    row.append("W"); 
                }
            }
            System.out.println(row.toString());
        }
    }
}
