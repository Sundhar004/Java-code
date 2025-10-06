public class LastIndexOfCharacter {
    public static void main(String[] args) {
        String s = "Programming";
        char target = 'g';
        int ans = lastInd(s,target);
        System.out.println(ans);
    }
    public static int lastInd(String s, char target)
    {
        int ind = -1 ;
        for(int i = s.length()-1; i>=0; i--)
        {
           if(s.charAt(i) == target)
           {
             ind = i;
             break;
           }
        }
        return ind;
    }
}
