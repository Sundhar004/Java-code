public class WaterBottle
{
    public static void main(String[] args)
    {
       int bottle = 65;
       int numEx = 3;
       int res = waterBottle(bottle, numEx);
       System.out.println(res); 
    }
    public static int waterBottle(int bottle, int numEx)
    {
        
        int ans = bottle;
        int mod, div; 
        if(bottle > numEx)
        {
        while(bottle >= numEx)
        {
            mod = bottle % numEx;
            div = bottle / numEx;
            ans += div;
            bottle=mod+div;
        }
        return ans;
        }
        else if(bottle == numEx)
        {
            return bottle+1;
        }
        else
        {
            return bottle;
        }

    }
}