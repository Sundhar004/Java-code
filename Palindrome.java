public class Palindrome {
    public static void main(String[] args)
    {
        int n=121;
        boolean res=pal(n);
        System.out.print(res);
    }
    public static boolean pal(int n)
    {
        int orig=n;
        int rev=0;
        int mod;
        while(n!=0)
        {
            mod=n%10;
            rev=rev*10+mod;
            n=n/10;
        }
        return rev==orig;
    }
}
