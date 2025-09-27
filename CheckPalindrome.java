import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = checkPal(s);
        System.out.println(res);
        sc.close();
    }
    public static boolean checkPal(String s)
    {
        boolean res = true;
        char arr[] = s.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end)
       {
            if(arr[start] != arr[end])
            {
                res = false;
            }
            start++;
            end--;
       }
          
          return res;
    }
}
