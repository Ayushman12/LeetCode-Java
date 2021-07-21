import java.util.*;
public class StockExchange
{
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int current = prices[0],ans = 0;;
        for(int i = 1;i<prices.length;i++) {
            int temp = prices[i];
            prices[i] = prices[i]-current;
            if(prices[i]>0)
                ans = ans + prices[i];
            current = temp;
        }
        return ans;
    }
    public static void main()
    {
        StockExchange ob = new StockExchange();
        int arr[] = {1,4,2,4,2,5,3,6};
        System.out.println(ob.maxProfit(arr));
    }
}
