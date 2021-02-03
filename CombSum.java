import java.util.*;
public class CombSum
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        findCombination(candidates,0,target,res,new ArrayList());
        return res;
    }
    private void findCombination(int[] ar,int ind,int t,List<List<Integer>> res,List<Integer> lt)
    {
        if(t<0)
            return;
        if(t==0)
            res.add(new ArrayList(lt));
        for(int i=ind;i<ar.length;i++)
        {
            lt.add(ar[i]);
            findCombination(ar,i,t-ar[i],res,lt);
            lt.remove(lt.size()-1);
        }
    }
    public static void main()
    {
        CombSum ob = new CombSum();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Enter target:");
        int t = obj.nextInt();
        List<List<Integer>> res = ob.combinationSum(ar,t);
        for(i=0;i<res.size();i++)
        System.out.print(res.get(i)+" ");
    }
}