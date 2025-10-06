public class ReverseWithoutinbuiltInString {
    public static void main(String [] args)
    {
        String s = "This is Java";
        String ans = reverse(s);
        String answer[] = ans.split(" ");
        for(int i = answer.length-1; i>=0; i--)
        {
            System.out.print(answer[i]+" ");
        }
    }
    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return sb.reverse().toString();
    }
}
