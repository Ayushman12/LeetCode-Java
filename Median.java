public class Median
{
    public static void show()
    {
        int nums1[] = {1,3,4,5};
        int nums2[] = {2,4,6,8};
        int i = 0,j = 0,k=0,m = 4,n = 4;
        int[] ar = new int[m+n];
        double med;
        while (i<m && j <n) 
        { 
            if (nums1[i] <= nums2[j]) 
                ar[k++] = nums1[i++]; 
            else
                ar[k++] = nums2[j++];    
        } 
        while (i < m) 
            ar[k++] = nums1[i++]; 
        while (j < n) 
            ar[k++] = nums2[j++];
        int num1 = ar[((m+n)/2)-1],num2 = ar[((m+n)/2)];
        if((m+n)%2 == 0)
        System.out.println((num1+num2)/2.0);
        else
        System.out.println(num2);
    } 
}