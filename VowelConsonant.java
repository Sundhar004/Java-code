public class VowelConsonant {
    public static void main(String [ ]args)
    {
       String s = "Hello world";
       int vowel = vowelConsonant(s);
       int count = 0;
       for(int i = 0 ; i<s.length(); i++)
       {
        char ch = s.charAt(i);
        if(ch != ' ' )
        {
            count++;
        }
       }
       int cons = count - vowel;
       System.out.println("Vowel:"+vowel);
       System.out.println("Consonant:"+cons);
    }
    public static int vowelConsonant(String s)
    {
        int vowelcount = 0;
        for(char c : s.toCharArray())
        {
            if(c == 'a'||c== 'e'||c=='i'||c=='o'||c=='u'||c=='A'|| c=='E'||c=='I'||c=='O'||c=='U')
            {
                vowelcount++;
            }
        }
        return vowelcount;
    }
}
