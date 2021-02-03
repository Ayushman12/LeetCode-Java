import java.util.*;
public class WaterStorage
{
    public int trap(int[] height) 
    {
        int n = 0;
        int l=0,r=height.length-1;
        int l_max=0,r_max=0;
        while(l<=r)
        {
            //System.out.println("Left_Max: "+l_max+",Right_Max: "+r_max+",Ar[l]: "+height[l]+",Ar[r]: "+height[r]);
            if(height[l]<=height[r])
            {
                //System.out.println("In the left of the array.........");
                //System.out.println();
                if(height[l]>=l_max)
                l_max = height[l];
                else
                {
                    //System.out.println("Height = "+height[l]+" left max "+l_max+" water added "+(l_max-height[l]));
                    n = n + l_max - height[l];
                }
                l++;
            }
            else
            {
                //System.out.println("In the right of the array.........");
                //System.out.println();
                if(height[r]>=r_max)
                r_max=height[r];
                else
                {
                    //System.out.println("Height = "+height[r]+" right max "+r_max+" water added "+(r_max-height[r]));
                    n+=r_max-height[l];
                }
                r--;
            }
        }
        return n;
    }
    public static void main()
    {
        WaterStorage ob = new WaterStorage();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        int n = ob.trap(ar);
        System.out.println("Water traped = "+n+" units");
    }
}