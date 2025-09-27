import java.util.Scanner;
public class EvenCapsOddSmall
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char arr [] = a.toCharArray();
        for(int i = 0; i< arr.length; i++)
        {
            if(i % 2 == 0)
            {
                arr[i] = Character.toUpperCase(arr[i]);
            }
            else
            {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        System.out.println(new String(arr));
        sc.close();
    }
}