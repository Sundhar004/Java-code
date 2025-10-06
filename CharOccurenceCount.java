public class CharOccurenceCount {
    public static void main(String[] args)
    {
        char c = 'm';
        int count = 0;
        String s = "programming";
        for(char ch: s.toCharArray())
        {
            if(ch == c)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
