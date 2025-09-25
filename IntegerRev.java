public class IntegerRev {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        int mod=0;
        while(n!=0)
        {
            mod=n%10;
            rev=rev*10+mod;
            n=n/10;
        }
        System.out.println(rev);
    }
}
