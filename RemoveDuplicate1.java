public class RemoveDuplicate1 {
    public static void main(String[] args) {
        int n[]={1,1,1,1,2,2,3,4,5,5,6};
        int ans=0;
         
        System.out.print("["+n[0]);
        for(int j=1 ; j<=n.length-1; j++)
            {
                if( n[j]!=n[j-1])
                {
                  if(j<=n.length-1)
                  {
                    ans =n[j];
                    System.out.print(", "+ans);
                  }
                  else{
                  ans =n[j];
                  System.out.print(ans);
                  }
                }
                else
                {
                  continue;

                }
            }
            System.out.print("]");
       
    }
}
