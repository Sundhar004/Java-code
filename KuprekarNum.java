import java.util.*;
public class KuprekarNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int or=n;
        int count = 0;
        int square = n*n;

        while(or!=0)
        {
            count++;
            or/=10;
        }
        int divisor = (int)Math.pow(10,count);
        int right=square%divisor;
        int left = square/divisor;
        if(left+right == n)
        {
           System.out.print("Kuprekar number");
        }
        else{
            System.out.print("Not Kuprekar number");
        }
        sc.close();
    }
}
