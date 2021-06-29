import java.util.*;
public class SmallerThanCurrent
{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ar[] = new int[102];
        for(int i=0;i<nums.length;i++){
            ar[nums[i]+1]++;
        }
        for(int i=0;i<=100;i++)
            ar[i+1] = ar[i+1]+ar[i];
        for(int i=0;i<nums.length;i++)
            nums[i]=ar[nums[i]];
        return nums;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        SmallerThanCurrent ob = new SmallerThanCurrent();
        int n = obj.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        ar[i] = obj.nextInt();
        ob.smallerNumbersThanCurrent(ar);
        for(int i=0;i<n;i++)
        System.out.print(ar[i]+" ");
    }
}
