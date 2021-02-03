import java.util.*;
public class Jump2
{
    public int max(int[] nums,int i,int j)
    {
        int ind = i;
        if(j>=nums.length)
        return nums.length-1;
        else
        {
            int max = nums[ind];
            for(int k = i;k<=j;k++)
            if(nums[k]>=max)
            {
                max = nums[k];
                ind = k;
            }
        }
        return ind;
    }
    public int jump(int[] nums) 
    {
        int res=0;
        int i=0,at,at_max;
        int l = nums.length-1;
        while(i<l)
        {
            at = nums[i];
            if(i+at==l)
            return res+1;
            at_max = max(nums,i+1,i+at);
            if(nums[i]>nums[at_max])
            i+=nums[i];
            else
            i = at_max;
            res++;
            System.out.println("Index = "+i+" step taken "+res);
        }
        return res;
    }
    public static void main()
    {
        Jump2 ob = new Jump2();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        int n = ob.jump(ar);
        System.out.println("Steps taken : "+n);
    }
}