
public class AvgArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4};
        double res = avg(arr);
        System.out.println(res);
    }

    public static double avg(int arr[])
    {
       int sum = 0;
       for(int i: arr)
       {
          sum = sum + i;
       }
       int len = arr.length;
       double avg = (double)sum/len;
       return avg;
    }
}
