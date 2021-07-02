import java.util.*;
public class IntToRoman
{
    public String intToRoman(int num) {
        String ans ="";
        while(num>=1000){
            ans = ans+"M";
            num = num-1000;
        }
        if(num>=900){
            ans=ans+"CM";
            num=num-900;
        }
        if(num>=500){
            ans=ans+"D";
            num=num-500;
        }
        if(num>=400){
            ans=ans+"CD";
            num=num-400;
        }
        while(num>=100){
            ans += "C";
            num-=100;
        }
        if(num>=90){
            ans+="XC";
            num=num-90;
        }
        if(num>=50){
            ans=ans+"L";
            num=num-50;
        }
        if(num>=40){
            ans=ans+"XL";
            num=num-40;
        }
        while(num>=10)
        {
            ans+="X";
            num-=10;
        }
        if(num>=9){
            ans+="IX";
            num-=9;
        }
        if(num>=5)
        {
            ans+="V";
            num-=5;
        }
        if(num>=4){
            ans+="IV";
            num-=4;
        }
        while(num>=1){
            ans+="I";
            num-=1;
        }
        return ans;
    }
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = obj.nextInt();
        IntToRoman ob = new IntToRoman();
        System.out.println("Roman : "+ob.intToRoman(n));
    }
}