public class RevFunc {
    public static void main(String[] args)
    {
        int n = 1234;
        int res = revFunc(n);
        System.out.println(res);
    }
    public static int revFunc(int n)
    {
        int rev=0;
        while(n!=0)
        {
        int mod = n % 10;
        rev = rev*10 + mod;
        n/=10;
        }
        return rev;
    }
}
