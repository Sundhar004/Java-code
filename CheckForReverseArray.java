public class CheckForReverseArray {
    public static void main(String [] args)
    {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,4,3,2,1};
        int ans[] = reverseArr(arr1);
        boolean answer = checkReverse(ans, arr2);
        System.out.println(answer);
    }
    public static int []reverseArr(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static boolean checkReverse(int ans[], int arr2[] )
    {
        boolean fin = true;
        int ind = 0;
        for(int i : ans)
        {
            if(i != arr2[ind++])
            {
             fin = false;
            }
            else
            {
                fin = true;
            }
        }
        return fin;
    }
}
