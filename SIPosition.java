import java.util.*;
class SIPosition 
{
    public int searchInsert(int[] nums, int target) 
    {
        int i,l = nums.length,ind=0;
        int ff=0,fr=l-1;l = nums.length;
        if(target<nums[0])
        return 0;
        else if(target>nums[l-1])
        return l-1;
        else
        {
            int f=0,r=l-1;
            while(f<=r)
            {
                ff=f;
                fr=r;
                System.out.println("Index shrinked between "+ff+" and "+fr);
                int mid = (f + r)/2;
                if(nums[mid]==target)
                return mid;
                else if(nums[mid]<target)
                f=mid+1;
                else
                r=mid-1;
            }
            for(i=ff;i<=fr;i++)
            if(nums[i]>target)
            {
                ind = i;
                break;
            }
            else
            ind=i+1;
        }
        return ind;
    }
    public static void main()
    {
        SIPosition ob = new SIPosition();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Enter target:");
        int t = obj.nextInt();
        int ans = ob.searchInsert(ar,t);
        System.out.println("Index = "+ans);
    }
}