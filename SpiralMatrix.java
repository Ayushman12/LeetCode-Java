import java.util.*;
public class SpiralMatrix
{
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans = new ArrayList<Integer>();
        int rowBegin=0,colBegin=0;
        int rowEnd = matrix.length-1, colEnd = matrix[0].length-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd)
        {
            for(int i=colBegin;i<=colEnd;i++)
            ans.add(matrix[rowBegin][i]);
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++)
            ans.add(matrix[i][colEnd]);
            colEnd--;
            if(rowBegin<=rowEnd)
            for(int i=colEnd;i>=colBegin;i--)
            ans.add(matrix[rowEnd][i]);
            rowEnd--;
            if(colBegin<=colEnd)
            for(int i=rowEnd;i>=rowBegin;i--)
            ans.add(matrix[i][colBegin]);
            colBegin++;
        }
        return ans;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        SpiralMatrix ob = new SpiralMatrix();
        System.out.println("Enter rows : ");
        int m = obj.nextInt();
        System.out.println("Enter coloumns : ");
        int n = obj.nextInt();
        int[][] ar = new int[m][n];
        System.out.println("Enter Values :");
        for(int i=0;i<m;i++)
        for(int  j=0;j<n;j++)
        ar[i][j] = obj.nextInt();
        List<Integer> lt = ob.spiralOrder(ar);
        System.out.println("Spiral Order : ");
        for(int i=0;i<lt.size();i++)
        System.out.print(lt.get(i)+" ");
    }
}
