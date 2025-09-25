import java.util.*;

public class DelArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target = 20;
        int res[] = delArray(arr,target);
        System.out.println(Arrays.toString(res));
    }
    public static int [] delArray(int arr[], int target)
    {
        int b[] = new int[arr.length-1];
        int ind =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != target)
            {
               b[ind] = arr[i];
               ind++;
            }
            else{
                continue;
            }
        }
        return b;
    }
}
