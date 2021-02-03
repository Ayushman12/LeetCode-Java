import java.util.*;
public class RemoveElement
{
    public int removeElement(int[] nums, int val)
    {
        int i,j=0;
        for(i = 0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main()
    {
        RemoveElement ob = new RemoveElement();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter array element:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Enter element to be removed :");
        int t = obj.nextInt();
        int l = ob.removeElement(ar,t);
        System.out.println("New Length = "+l);
        System.out.print("Updated array :");
        for(i=0;i<l;i++)
        System.out.print(ar[i]+" ");
    }
}