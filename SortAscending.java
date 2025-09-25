import java.util.*;
public class SortAscending {
    public static void main(String[] args) {
        long arr[] ={35,69,8684,123};
        long temp;
        for(int i=0;i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
            if(arr[i]<arr[j])
            {
                continue;
            }
            else
            {
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }

          }
        }
       System.out.print(Arrays.toString(arr));
      }
}
