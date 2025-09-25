import java.util.Arrays;

public class MoveZeros
{
    public static void main(String[] args) {
        int arr[] = {1,0,3,0,12};
        int res[] = moveZeros(arr);
        System.out.println(Arrays.toString(res));
        }
        public static int []moveZeros(int arr[])
        {
            int new_arr[] = new int[arr.length];
            int ind = 0;
            for(int i : arr)
            {
               if(i != 0)
               { 
                  new_arr[ind] = i;
                  ind++; 
               }
            } 
            return new_arr;
        }
}
