public class ASCII_CharOfString
{
    public static void main(String[] args) {
        String s = "JAVA";
        findAsciiValue(s);
    }
    public static void findAsciiValue(String s)
    {
        for(char c : s.toCharArray())
        {
            int a = (int)c;
            System.out.print(a+" ");
        }
    }
}