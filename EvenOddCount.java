public class EvenOddCount {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int res = evenOddCount(arr);
        int oddCount = arr.length - res;
        System.out.println("Even:"+res+" Odd:"+oddCount);
    }
    public static int evenOddCount(int arr[])
    {
        int even = 0;
        for(int i=0; i<arr.length; i++)
        {
          if(arr[i] % 2 ==0)
          {
             even++;
          }
        }
        return even;
    }
}
