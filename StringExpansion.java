//Wrong code
public class StringExpansion {
    public static void main(String [] args)
    {
        String s = "a3b3cd4";
        String ans = compress(s);
        System.out.println(ans);
    }
    public static String compress(String s)
    {
       StringBuilder sb = new StringBuilder();
       int ind = 0;
       int freq[] = new int[26];
       char ch[] = s.toCharArray();
       for(char c : ch)
       {
         if(Character.isDigit(c))
         {
            freq[ch[ind - 1]]++;
            ind++;
         }
       }
       for(char c ='a'; c<='z';c++)
       {
          if(!Character.isDigit(c))
          {
            char cha = (c);
            sb.append(freq[c]);
          }
       }
       return sb.toString();
    }
}
