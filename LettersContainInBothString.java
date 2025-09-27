import java.util.*;
public class LettersContainInBothString {
    public static boolean checkAnag(String s1, String s2)
    {
         if(s1.length() != s2.length()) return false;
         char ch1[] = s1.toCharArray();
         char ch2[] = s2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
         String s1 = "listen";
         String s2 = "silent";
         boolean res = checkAnag(s1, s2);
         System.out.println(res);
    }
}
