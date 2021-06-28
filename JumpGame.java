import java.util.*;
class JumpGame 
{
    public boolean canJump(int[] nums) 
    {
        int reachable = nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i+nums[i]>=reachable)
            {
                reachable = i;
            }
        }
        return reachable==0;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        JumpGame ob = new JumpGame();
        System.out.println("Enter size of the array:");
        int n = obj.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter values:");
        for(int i =0;i<n;i++)
        ar[i] = obj.nextInt();
        if(ob.canJump(ar))
        System.out.println("Reachable");
        else
        System.out.println("Unreachable");
    }
}