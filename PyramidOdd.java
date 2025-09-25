public class PyramidOdd {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = 1; i <= (rows*2); i+=2) {
            for (int j = (rows*2); j > i; j--) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 
