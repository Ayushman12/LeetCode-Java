import java.util.*;
public class Pangram
{
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        Set<Character> mp = new HashSet();
        for(int i=0;i<sentence.length();i++) {
            if(!mp.contains(sentence.charAt(i)))
                mp.add(sentence.charAt(i));
        }
        if(mp.size()==26)
            return true;
        else
            return false;
    }
    public static void main()
    {
        Pangram ob = new Pangram();
        Scanner obj = new Scanner(System.in);
        System.out.println(ob.checkIfPangram(obj.nextLine()));
    }
}