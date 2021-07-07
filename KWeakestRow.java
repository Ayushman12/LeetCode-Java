import java.util.*;
public class KWeakestRow
{
    public int[] kWeakestRows(int[][] mat, int k) {
        int ar[][] = new int[mat.length][2];
        for(int i=0;i<mat.length;i++) {
            ar[i][0]=i;;
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j]==1)
                    ar[i][1]++;
                else {
                    break;
                }
            }
        }
        Arrays.sort(ar, (ar1,ar2) -> Integer.compare(ar1[1],ar2[1]));
        int ans[] = new int[k];
        for(int i=0;i<k;i++) {
            ans[i] = ar[i][0];
        }
        return ans;
    }
    public static void main() {
        KWeakestRow ob = new KWeakestRow();
        int mat[][] = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}},k = 3; 
        int ar[] = ob.kWeakestRows(mat,k);
    }
}
