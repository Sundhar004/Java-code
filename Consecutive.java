import java.util.*;
public class Consecutive {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.print(largest(a));
    }
    public static int largest(int[] num)
    {
        Set<Integer> set=new HashSet<>();
        for(int n:num)
           set.add(n);
        int max=0;
        for(int nums:set)
        {
            if(set.contains(nums-1))
               continue;
            int currLength=0;
            while(set.contains(nums))
            {
                currLength+=1;
                nums+=1;    
            }
            max=Math.max(max,currLength);
        }
        return max;
    }
}
