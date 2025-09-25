public class MonotonicArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean res = checkArray(arr);
        System.out.println(res);
    }
    public static boolean checkArray(int arr[])
    {
        boolean asc = true;
        boolean dsc = true;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]>arr[i+1]) asc = false;
            if(arr[i]<arr[i+1]) dsc = false;
        }
        return asc||dsc;
    }
}
    

