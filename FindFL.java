import java.util.*;
public class FindFL
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] ar = new int[] {-1,-1};
        int l = nums.length;
        int i = 0,j=l-1;
        int f1 = 0,f2 = 0;
        while(i<=j)
        {
            //System.out.println("i = "+i+" j = "+j);
            //System.out.println("nums["+i+"] = "+nums[i]+" f1 = "+f1+" target = "+target);
            if(nums[i]==target && f1==0)
            {
                ar[0] = i;
                f1=1;
            }
            //System.out.println("nums["+j+"] = "+nums[j]+" f2 = "+f2+" target = "+target);
            if(nums[j]==target && f2==0)
            {
                ar[1]=j;
                f2=1;
            }
            if(f1==0)
            i++;
            if(f2==0)
            j--;
            if(f1==1 && f2==1)
            {
                return ar;
            }
        }
        return ar;
    }
    public static void main()
    {
        FindFL ob = new FindFL();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Enter target:");
        int t = obj.nextInt();
        int[] ans = ob.searchRange(ar,t);
        System.out.println("Answer : ["+ans[0]+","+ans[1]+"]");
    }
}