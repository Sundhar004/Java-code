import java.util.*;

public class Automorphic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mod;
        int rev=0;
        int revsec=0;
        int count=0;
        int n = 376;
        int ori=n;
        
        while(n!=0)
        {
          
          count++;
          n=n/10;
        }

        int square = ori*ori;

        for(int i=1; i<=count; i++)
        {
            mod=square%10; //5 2
            rev=rev*10+mod; //5 52
            square/=10;
        }
      
      while(rev!=0)
        {
            mod=rev%10;
            revsec=revsec*10+mod;
            rev/=10;
        }
        System.out.println(revsec == ori); //625 25
        sc.close();
    }
}
