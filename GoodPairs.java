import java.util.*;
public class GoodPairs
{
    public int numIdenticalPairs(int[] nums) 
    {
        int ans=0,l=nums.length;
        int[] freq = new int[101];
        for(int i:nums)
        {
            if(freq[i]>=1)
                freq[i]++;
            else
                freq[i]=1;
        }
        for(int i:freq)
        if(i>1)
        ans = ans + (i*(i-1))/2;
        return ans;
    }
    public static void main()
    {
        GoodPairs ob = new GoodPairs();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size :");
        int size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values");
        for(int i=0;i<size;i++)
        ar[i] = obj.nextInt();
        int t = ob.numIdenticalPairs(ar);
        System.out.println("Good pairs : "+t);
    }
}
