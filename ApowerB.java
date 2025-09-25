import java.util.*;
public class ApowerB {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        pow(a,b);
        sc.close();
    }
    public static void pow(int a, int b)
    {
        int c=1;
        for(int i=1; i<=b; i++)
        {
            c=c*a;
        }
        System.out.println(c);
    }
}