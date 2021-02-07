import java.util.*;
public class MaximumSubArray
{
    public int maxSubArray(int[] nums) 
    {
        int max_ending = 0,max_sum = Integer.MIN_VALUE;
        int l = nums.length;
        for(int i=0;i<l;i++)
        {
            max_ending = max_ending + nums[i];
            if(max_sum<max_ending)
                max_sum = max_ending;
            if(max_ending<0)
                max_ending = 0;
        }
        return max_sum;
    }
    public static void main()
    {
        MaximumSubArray ob = new MaximumSubArray();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        int n = ob.maxSubArray(ar);
        System.out.println("Maximum Sum = "+n);
    }
}
