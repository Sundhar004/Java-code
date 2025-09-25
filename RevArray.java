import java.util.Arrays;
import java.util.*;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size ;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[size];
        int j=0;
        for(int i=(a.length)-1; i>=0; i--)
        {
            b[j]=a[i];
            j++;
           
        }
        System.out.print(Arrays.toString(b));
        sc.close();
    }
}
