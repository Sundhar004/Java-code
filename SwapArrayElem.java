import java.util.*;
public class SwapArrayElem {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        int pos1 = 1;
        int pos2 = 3;
        int res[] =arrIns(arr, pos1,pos2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] arrIns(int arr[], int pos1, int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        return arr;
    }
}