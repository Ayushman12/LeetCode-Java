import java.util.*;
public class FMPositive
{
    public int firstMissingPositive(int[] nums) 
    {
        Arrays.sort(nums);
        int res = 1;
        if(nums.length==0)
        return 1;
        if(nums.length==1)
        {
            if(nums[0]==1)
            return 2;
            else
            return 1;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("We are at "+nums[i]);
            if(nums[i]>0 && nums[i-1]>=0 && nums[i]-nums[i-1]!=1)
            return (nums[i-1]+1);
        }
        res = nums[nums.length-1]+1;
        return res;
    }
    public static void main()
    {
        FMPositive ob = new FMPositive();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = obj.nextInt();
        int ar[] = new int[size];
        int i;
        System.out.println("Enter values");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Missing Value is "+ob.firstMissingPositive(ar));
    }
}