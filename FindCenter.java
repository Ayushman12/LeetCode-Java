import java.util.*;
public class FindCenter
{
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet();
        for(int i = 0;i<edges.length;i++) {
            for(int j=0;j<2;j++) {
                int n = edges[i][j];
                if(set.contains(n))
                    return n;
                else 
                    set.add(n);
            }
        }
        return 0;/*
        int e0 = edges[0][0];
        int e1 = edges[0][1];
        int e2 = edges[1][0];
        int e3 = edges[1][1];
        if(e0 == e2 || e0 == e3) return e0;
        if(e1 == e2 || e1 == e3) return e1;
        return -1;*/
    }
    public static void main()
    {
        FindCenter ob = new FindCenter();
        int ar[][] = {{1,2},{1,3},{1,4}};
        System.out.println("Center : "+ob.findCenter(ar));
    }
}
