public class BinSearch {
    public static void main(String[] args)
    {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        int target = 2;
        int res = BinarySearch(arr, target);
        System.out.println(res);
   }
   public static int BinarySearch(int a[], int target)
   {
      int left = 0;
      int right = a.length-1;
      while(left<= right)
      {
        int mid = left+(right-left)/2;
        if(a[mid] == target)
        {
            return mid;
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
      return -1;
   }
}
