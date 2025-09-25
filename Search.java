public class Search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 3;
        String ans = search(arr,target);
        System.out.println(ans); 
    }
    public static String search(int arr[], int target)
    {
        String res="Not found";
        int left = 0;
        int right = arr.length-1;
        while(left<=right)
        {
        int mid = left+(right-left)/2;
        if(arr[mid] == target)
        {
            res = "Found";
            break;
        }
        else if(arr[mid]>target)
        {
            right = mid-1;
        }
        else if(arr[mid]<target)
        {
            left=mid+1;
        }
    }
        return res;
    }
}
