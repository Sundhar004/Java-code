import java.util.Arrays;

public class ArrayRotate {
    public static int [] rotateArray (int arr[] ,int k)
    {
        k = k % arr.length;
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
        return arr;
    }
    public static int [] reverseArray(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args)
    {
       int arr[] = {1,2,3,4,5};
       int k = 2;
       int res[] = rotateArray(arr,k);
       System.out.println(Arrays.toString(res));
    }
}