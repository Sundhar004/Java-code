public class ArrayElemFreq {
    public static void main(String[] args)
    {
        int arr[] = {1,1,2,3,3,4,4,4,4};
        int count = 1;
        for(int i=0; i<arr.length-1; i++)
        {
           if(arr[i] == arr[i+1] )
           {
              count++;
             
           }     
            else
            {
              System.out.println("Freq of "+arr[i]+" is: "+(count));
              count = 1;
            }
       }
        System.out.println("Freq of "+arr[arr.length-1]+" is: "+(count));
    }
}
