public class Single {
    public static int singleNumber(int[] arr) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i<arr.length; i++)
        {
            
          for(int j =0; j<arr.length; j++)
          {
            
            if(arr[i]==arr[j])
            {
                count++;          
            }
        }
          if(count==1)
          {
            ans = arr[i];
            break;
          }
          count=0;
        }
        return ans;
    }
    public static void main(String[]args)
    {
        int arr[] ={2,2,1};
        int res = singleNumber(arr);
        System.out.println(res);
    }
}
