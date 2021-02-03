import java.util.*;
public class PivotedBSearch
{
    int pivotPoint(int ar[])
    {
        int i,x=-1,l = ar.length;
        for(i=0;i<l-1;i++)
        if(ar[i]>ar[i+1])
        {
            x=i+1;
            break;
        }
        return x;
    }
    int binarySearch(int[] ar,int f,int r,int t)
    {
        if(f>r)
        return -1;
        //System.out.println("Front = "+f+" rear = "+r);
        int mid = (f+r)/2;
        if(ar[mid]==t)
        return mid;
        else if(ar[mid]>t)
        return binarySearch(ar,f,mid-1,t);
        else
        return binarySearch(ar,mid+1,r,t);
    }
    public int search(int[] nums, int target) 
    {
        int l =nums.length;
        int pivot = pivotPoint(nums);
        int ind = -1;
        if(pivot==-1)
        ind = binarySearch(nums,0,l-1,target);
        else
        {
            if(target<=nums[l-1])
            ind = binarySearch(nums,pivot,l-1,target);
            else if(target<=nums[pivot-1])
            ind = binarySearch(nums,0,pivot-1,target);
        }
        return ind;
    }
    public static void show()
    {
        PivotedBSearch ob = new PivotedBSearch();
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Enter target:");
        int t = obj.nextInt();
        int res = ob.search(ar,t);
        System.out.println(res);
    }
}