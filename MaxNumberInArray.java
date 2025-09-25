public class MaxNumberInArray {
    public static void main(String[] args)
    {
        int arr[] ={1,2,3,4,55,9,10,11};
        int res = FindMaxi(arr);
        System.out.println(res);
    }
    public static int FindMaxi(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max = i;
            }

        }
       return max;
    }
} 