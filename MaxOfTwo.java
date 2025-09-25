public class MaxOfTwo {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int res=FindMax(a,b);
        System.out.println(res);
    } 
    public static int FindMax(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
