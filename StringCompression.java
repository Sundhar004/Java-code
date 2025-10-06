public class StringCompression {
    public static void main(String [] args)
    {
        String s = "aaabbbcccdddaaa";
        String ans = compress(s);
        System.out.println(ans);
    }
    public static String compress(String s)
    {
       StringBuilder sb = new StringBuilder();
       int freq[] = new int[26];
       for(char c : s.toCharArray())
       {
        freq[c - 'a']++;
       }
       for(int i = 0 ; i<26 ; i++)
       {
          if(freq[i]!=0)
          {
            char ch = (char) (i + 'a');
            sb.append(ch);
            sb.append(freq[i]);
          }
       }
       return sb.toString();
    }
}