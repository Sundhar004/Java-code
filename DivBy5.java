public class DivBy5 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=500; i<=1000; i++)
        {
            if(i%5==0)
            {
               count++;
            }

        }

        System.out.println(count);
    }
}
