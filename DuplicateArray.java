import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,1};
        int res[] = removeDuplicate(arr);
        int res1[] = new int[res.length];
        int ind =  0;
        for(int i=0; i<res.length; i++)
        {
            if(res[i] != -1)
            {
               res1[ind++] = res[i];
            }
            
        }
        System.out.print(Arrays.toString(res1));
    }
    public static int[] removeDuplicate(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++){
            if(arr[i] == arr[j])
            {
                arr[j]=-1;
            }
        }
        
    }
    return arr;
}
}
