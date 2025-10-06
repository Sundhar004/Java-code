public class DigitsOnlyInString
{
    public static void main(String[] args) {
        String s = "12345";
        boolean res = isDigitOnly(s);
        System.out.println(res);
    }
    public static boolean isDigitOnly(String s)
    {
        boolean ans = true;
        char str[] = s.toCharArray();
        for(char c: str)
        {
            if(!Character.isDigit(c))
            {
                ans = false;
            }
        }
        return ans;
    }
}