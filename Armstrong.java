public class Armstrong
{
    public static void main(String[] args) {
        int mod;
        int sum=0;
        int n = 153;
        int ori = n;
        while(n!=0)
        {
            mod=n%10;
            sum+=(mod*mod*mod);
            n=n/10;
        }
        System.out.println(sum == ori);
    }
}