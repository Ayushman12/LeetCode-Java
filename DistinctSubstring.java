import java.util.*;
public class DistinctSubstring
{
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;
        int ans=0;
        for(int i=0;i<s.length()-2;i++) {
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i+2)!=s.charAt(i))
                ans++;
        }
        return ans;
    }
    public static void main()
    {
        DistinctSubstring ob = new DistinctSubstring();
        System.out.println(ob.countGoodSubstrings("asdesdfesdfgtfgfhgfgtreefjfuccsfghh"));
    }
}
