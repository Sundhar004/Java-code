import java.util.*;
public class MoveZerosWithoutNewArray {
    public static void main(String[] args)
    {
        int arr[] ={1,0,3,0,12 };
        int res[]=moveZeros(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] moveZeros(int[] arr)
    {
            int ind = 0;
            for(int i : arr)
            {
               if(i != 0)
               { 
                  arr[ind] = i;
                  ind++; 
               }
            } 
            for(int i =ind; i<arr.length; i++)
            {
                arr[i] = 0;
            }
            return arr;
    } 
}
