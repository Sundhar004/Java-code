public class CompStringWithoutInBuilt {
    public static void main(String [] args)
    {
        String s1 = "Sam";
        String s2 = "Sam";
        boolean ans = comp(s1, s2);
        System.out.print(ans);
    }
    public static boolean comp(String s1, String s2)
    {
        if(s1.length() != s2.length()) return false;
        boolean an = true;
        for(int i = 0; i<s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                an = false;
                break;
            }
            
        }
        return an;
    }

}
