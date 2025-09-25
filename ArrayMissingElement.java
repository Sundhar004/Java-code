public class ArrayMissingElement
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int res = findMissing(arr);
        System.out.println(res);
    }
    public static int findMissing(int arr[])
    {
        int ArrSum = 0;
        int sum = 0 ;
        int n = arr.length+1;
        sum = n*(n+1)/2;
        for(int i=0; i<arr.length; i++)
        {
           ArrSum = ArrSum+arr[i];
        }
        int ans = sum - ArrSum;
        return ans;
    }
}