import java.util.Arrays;
public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[]={4,5,6};
        int ind=0;
        int new_arr[] = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++)
        {
           new_arr[ind] = arr1[i];
           ind++;
        }
        ind = arr1.length;
        for(int i=0; i<arr2.length; i++)
        {
           new_arr[ind] = arr2[i];
           ind++;
        }
        System.out.println(Arrays.toString(new_arr));
    }
}