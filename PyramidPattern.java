public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print("  "); // Two spaces for better centering
            }
            // Print stars with spaces
            for (int k = 1; k <= i; k++) {
                System.out.print("*   ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
