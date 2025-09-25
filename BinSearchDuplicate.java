public class BinSearchDuplicate {
    public static void main(String[] args)
    {
        int arr[] ={1,1,1,1,2,2,2,2,3,4,5,6,7,8,9};
        int target = 2;
        int res = BinarySearch(arr, target);
        System.out.println(res);
   }
   public static int BinarySearch(int a[], int target)
   {
      int left = 0;
      int right = a.length-1;
      int result = -1;
      while(left<= right)
      {
        int mid = left+(right-left)/2;
        if(a[mid] == target)
        {
            result=mid;
            right=mid-1;
        }
        else if(a[mid] > target)
        {
             right = mid-1;
        }
        else
        {
            left = mid+1;
        }
      }
      return result;
   }
}
