import java.util.*;
public class CountBit
{
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=1;i<=n;i++) {
            if(i%2==1)
                ans[i] = ans[i-1]+1;
            else
                ans[i] = ans[i/2];
        }
        return ans;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        CountBit ob = new CountBit();
        int ar[] = ob.countBits(obj.nextInt());
        for(int i=0;i<ar.length;i++)
        System.out.print(ar[i]+" ");
    }
}
