import java.util.*;
public class FactFun {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res = factorial(n);
        System.out.println(res);
        sc.close();
    }
    public static int factorial(int a)
    {
        int fact=1;
        for(int i=1;i<=5;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
