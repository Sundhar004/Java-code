import java.util.*;
public class ArrayIns {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        int elem = 15;
        int pos = 1;
        int res[] =arrIns(arr, elem, pos);
        System.out.println(Arrays.toString(res));
    }
    public static int[] arrIns(int arr[], int elem, int pos)
    {
        int b[] = new int[arr.length+1];
        int ind=0;
          for(int j=0; j<b.length; j++){
           if(j!=pos)
           {
            b[j] = arr[ind];
            ind++;
           }
           else
           {
              b[j] = elem;
           }
        }
      
        return b;
    }
}
