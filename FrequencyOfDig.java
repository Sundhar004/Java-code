public class FrequencyOfDig {
   public static void main(String[] args) {
    int  n = 122355;
    int or = n;
    int count = 0;
    int mod;

      for(int j=0; j<=9 ; j++)
      {
         while(n!=0)
        {
         mod = n%10;
         n=n/10; 
         
         
        if(j == mod)
               count++;
        }
        if(count!=0)
           System.out.println("Freq of "+j+" is:"+count);
        count=0;
        n=or;
    }

   } 
}
