public class SmallestMissingPositive {
    public static void main(String[] args) {
        int arr[] = {7,8,9,11,12}; 
        int ans=findSmallestMissing(arr);
        System.out.println(ans);
    }

    public static int findSmallestMissing(int arr[])
    {
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            while(arr[i]>0 && arr[i] <= arr.length && arr[arr[i]-1] != arr[i])
            {
                temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }

        for(int i=0; i<arr.length; i++)
        { 
              if(arr[i] != i+1)
                 {  
                    return i+1;
                 }   
            
        }
        return arr.length+1;
    }
}
