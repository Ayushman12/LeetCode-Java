import java.util.*;
public class ConsistentString
{
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> st = new HashSet();
        for(int i=0;i<allowed.length();i++)
            st.add(allowed.charAt(i));
        int c = words.length;
        for(int i=0;i<words.length;i++) {
            for(int j=0;j<words[i].length();j++) {
                //System.out.println("Checking "+words[i].charAt(j)+" in "+allowed);
                if(!st.contains(words[i].charAt(j))) {
                    //System.out.println(words[i]);
                    c--;
                    break;
                }  
            }
        }
        return c;
    }
    public static void main()
    {
        ConsistentString ob =  new ConsistentString();
        String allowed = "ab", words[] = {"ad","bd","aaab","baa","badab"};
        System.out.println("Consistent Strings are : "+ ob.countConsistentStrings(allowed,words));
    }
}
