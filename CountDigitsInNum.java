import java.util.*;
public class CountDigitsInNum {
    public static void main(String [] args)
    {
        int count = 0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        System.out.println(count);
        sc.close();
    }
}
