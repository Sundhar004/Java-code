import java.util.*;
public class ArrayCopy {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int b[] = new int[arr.length];
        int ind = 0;
        for(int i: arr)
        {
            b[ind] = i;
            ind++;
        }
        System.out.println(Arrays.toString(b));
    }
}
