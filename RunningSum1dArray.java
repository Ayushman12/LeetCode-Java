import java.util.*;
public class RunningSum1dArray
{
    public int[] runningSum(int[] nums) { 
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        RunningSum1dArray ob = new RunningSum1dArray();
        System.out.println("Enter number of elements:");
        int n = obj.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        ar[i] = obj.nextInt();
        ob.runningSum(ar);
        System.out.print("Running sum : ");
        for(int i=0;i<n;i++)
        System.out.print(ar[i]+" ");
    }
}