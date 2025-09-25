public class MinNumberArray {
    public static void main(String [] args)
    {
        int arr[] = {5,44,2,88,100};
        int res = FindMin(arr); 
        System.out.println(res);
    }
    public static int FindMin(int arr[])
    {
        int min = Integer.MAX_VALUE;
        for(int i: arr)
        {
            if(i < min)
            {
                min = i;
            }
        }
        return min;
    }
}
