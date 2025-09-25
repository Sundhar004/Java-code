public class Fibonacci {
      public static void main(String[] args) {
        int n=6;
        
        System.out.println(fib(n));
      }
     public static int fib(int n)
        {

            int first=0;
            int second=1;
            int third=0;

            for(int i=1;i<n;i++)
            {
                third=first+second;
                first=second;
                second=third;
            }
            return third;
        } 
    }