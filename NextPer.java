import java.util.*;
public class NextPer
{
    /*public int maxIndex(int[] ar,int f,int r,int t)
    {
        int x,i;
        Arrays.sort(ar,f,r);
        for(i=f;i<r;i++)
        if(ar[i]>t)
        {
            x=i;
            break;
        }
        return x;
    }*/
    public void show(int ar[])
    {
        System.out.print("Array :  ");
        int i;
        for(i = 0;i<ar.length;i++)
        System.out.print(ar[i]+" ");
        System.out.println();
    }
    public void nextPermutation(int[] nums) 
    {
        int i,l = nums.length;
        if(l>1)
        {
            int m = -1;
            for(i=l-2;i>=0;i--)
            {
                if(nums[i]<nums[i+1])
                {
                    m=i;
                    break;
                }
            }
            if(m==-1)
            Arrays.sort(nums);
            else
            {
                Arrays.sort(nums,m+1,l);
                //show(nums);
                for(i=m+1;i<l;i++)
                {
                    if(nums[i]>nums[m])
                    {
                        int t = nums[m];
                        nums[m] = nums[i];
                        nums[i] = t;
                        break;
                    }
                }
                Arrays.sort(nums,m+1,l);
                //show(nums);
            }
        }
    }
    public static void main()
    {
        NextPer ob = new NextPer();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size:");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        ob.nextPermutation(ar);
        System.out.print("Next Permutation : ");
        for(i=0;i<size;i++)
        System.out.print(ar[i]+" ");
    }
}