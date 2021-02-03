import java.util.*;
import java.util.stream.Collectors; 
public class CombSum2
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        if(candidates.length==0)
        return res;
        findCombination(candidates,0,target,res,new ArrayList());
        //List<List<Integer>> newList = res.stream().distinct().collect(Collectors.toList()); 
        return res;
    }
    private void findCombination(int[] ar,int ind,int t,List<List<Integer>> res,List<Integer> lt)
    {
        if(t<0)
            return;
        if(t==0 && !res.contains(lt))
        {
            res.add(new ArrayList(lt));
        }
        for(int i=ind;i<ar.length;i++)
        {
            if(lt.size()==0 && i!=0 && ar[i]==ar[i-1])
            continue;
            lt.add(ar[i]);
            findCombination(ar,i+1,t-ar[i],res,lt);
            lt.remove(lt.size()-1);        
        }
    }
    public static void main()
    {
        CombSum2 ob = new CombSum2();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size :");
        int i,size = obj.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter values:");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        System.out.println("Enter target:");
        int t = obj.nextInt();
        List<List<Integer>> res = ob.combinationSum2(ar,t);
        for(i=0;i<res.size();i++)
        System.out.print(res.get(i)+" ");
    }
}