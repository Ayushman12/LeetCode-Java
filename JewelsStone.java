import java.util.*;
public class JewelsStone
{
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> ht = new HashMap<Character,Integer>();
        for(int i=0;i<stones.length();i++){
            if(!ht.containsKey(stones.charAt(i))){
                ht.put(stones.charAt(i),1);
            }
            else
            ht.put(stones.charAt(i),ht.get(stones.charAt(i))+1);
        }
        int s=0;
        for(int i=0;i<jewels.length();i++){
            if(ht.containsKey(jewels.charAt(i)))
            s=s+ht.get(jewels.charAt(i));
        }
        return s;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        JewelsStone ob = new JewelsStone();
        String stones,jewels;
        System.out.println("Enter jewels:");
        jewels = obj.nextLine();
        System.out.println("Enter stones:");
        stones = obj.nextLine();
        int x = ob.numJewelsInStones(jewels,stones);
        System.out.println(x);
    }
}