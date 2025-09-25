public class EvenOddPattern {
    public static void main(String[] args) {
        int n = 5;
        int odd = 1, even = 2; 

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { 
                for (int j = 1; j <= i; j++) {
                    System.out.print(odd + " ");
                    odd += 2;
                }
            } else { 
                for (int j = 1; j <= i; j++) {
                    System.out.print(even + " ");
                    even += 2;
                }
            }
            System.out.println();
        }
    }
}

/*
 * 1
 * 2 4
 * 3 5 7
 * 6 8 10 12
 * 9 11 13 15 17
 */