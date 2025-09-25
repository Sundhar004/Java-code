public class PrimeFunc {
    public static void main(String[] args)
    {
       int n = 6;
       boolean res = FindPrime(n);
       if(res == true)
       {
         System.out.println("Prime number");
       }
       else
       {
         System.out.println("Not Prime");
       }

    }
    public static boolean FindPrime(int n)
    {
        boolean bool = true;
        for(int i=2; i<n ; i++)
        {
            if(n % i == 0)
            {
              bool = false;
              break;
            } 
        }
        return bool;
    }
}
