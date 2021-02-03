import java.util.*;
public class RemoveDuplicate
{
    public int removeDuplicates(int[] nums) 
    {
        int i,n = 0,l = nums.length;
        List<Integer> lt = new ArrayList<>();
        for(i=0;i<l;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                lt.add(nums[i]);
            }
        }
        l = lt.size();
        for(i=0;i<l;i++)
        nums[i]=lt.get(i);
        return l;
    }
    public static void main()
    {
        RemoveDuplicate ob = new RemoveDuplicate();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = obj.nextInt();
        int i,res,ar[] = new int[size];
        System.out.println("Enter array elements:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        res = ob.removeDuplicates(ar);
        System.out.println("Length = " + res);
        System.out.println("Array : ");
        for(i=0;i<res;i++)
        System.out.print(ar[i] + " ");
    }
}