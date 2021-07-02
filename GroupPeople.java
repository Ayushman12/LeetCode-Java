import java.util.*;
public class GroupPeople
{
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> lt = new ArrayList();
        Map<Integer, List<Integer>> mp = new HashMap();
        for(int i=0;i<groupSizes.length;i++) {
            if(mp.containsKey(groupSizes[i])) {
                mp.get(groupSizes[i]).add(i);
            }
            else {
                mp.put(groupSizes[i],new ArrayList());
                mp.get(groupSizes[i]).add(i);
            }
        }        
        for (Map.Entry<Integer,List<Integer>> mt : mp.entrySet()) {
            int k = (int)mt.getKey();
            List<Integer> l = new ArrayList(mt.getValue());
            for(int i=0;i<l.size();i+=k) {
                List<Integer> ad = new ArrayList();
                for(int j=i;j<i+k;j++) {
                    ad.add(l.get(j));
                }
                lt.add(ad);
            }
        }
        return lt;
    }
    public static void show()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size");
        int n = obj.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        ar[i] = obj.nextInt();
        GroupPeople ob = new GroupPeople();
        List<List<Integer>> a = ob.groupThePeople(ar);
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}