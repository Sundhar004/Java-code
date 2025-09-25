public class PrimeNoCountBetween {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;
        int res = CountPrimeNo(a,b);
        System.out.print(res);
    }
    public static int CountPrimeNo(int a, int b)
    {
        boolean cond = true;
        int count = 0;
        while(a<=b)
        {
            for(int j = 2; j<a ; j++)
            {
                if(a % j == 0)
                {
                    cond = false;
                    break;
                }
        }
              if(cond == true)
                {
                  count++;
                }
                cond = true;
            a++;
        }
        return count;
    }
}
