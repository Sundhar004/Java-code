import java.util.Arrays;

public class RevArrayTwoPointer {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int res[] = reverse(arr);
        System.out.print(Arrays.toString(res));
    }
    public static int[] reverse(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
        }
        return arr;
    }
}
