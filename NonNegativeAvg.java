class NonNegativeAvg {
    public static double posAverage(int[] arr) {
        int sum = 0;
        int count = 0;
        for(int i:arr)
        {
            if(i<0)
            {
                continue;
            }
            else
            {
                sum = sum+i;
                count+=1;
            }
        }
        double avg = (double)sum/count;
        return avg;
    }
    public static void main(String[] args) {
        int arr[] = {-12, 8, -7, 6, 12, -9, 14};
        double res = posAverage(arr);
        System.out.println(res);
    }
}