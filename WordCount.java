public class WordCount {
    public static void main(String[] args)
    {
        String s = "Java is a powerful language";
        int ans = count(s);
        System.out.print(ans);
    }
    public static int count(String s)
    {
        int count = 0;
        s.trim();
        String str[] = s.split(" ");
        for(int i = 0 ; i<str.length;i++)
        {
           count++;
        }
        return count;
    }
}
