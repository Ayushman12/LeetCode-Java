import java.util.*;
import java.lang.Math;
public class LastStoneWeight
{
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i:stones)
            pq.add(i);
        while(pq.size()>1) {
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y) { 
                System.out.println(x+" and "+y+" collided and remaining "+Math.abs(x-y)+" is added to list");
                pq.add(Math.abs(x-y));
            }
        }
        if(pq.isEmpty()) return 0;
        else return pq.poll();
    }
    public static void main()
    {
        LastStoneWeight ob = new LastStoneWeight();
        int arr[] = {2,2};
        System.out.println(ob.lastStoneWeight(arr));
    }
}
