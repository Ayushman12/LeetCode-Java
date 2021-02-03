import java.util.*;
public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] ar) 
    {
        List<List<Integer>> Ar = new ArrayList<List<Integer>>();
        Arrays.sort(ar);
        int i,front,rear,sum;
        for(i = 0;i<ar.length-2;i++)
        {
            if(i==0 || (i>0 && ar[i]!=ar[i-1]))
            {
                front = i + 1;
                rear = ar.length - 1;
                sum = 0 - ar[i];
                while(front<rear)
                {
                    if(ar[front]+ar[rear]==sum)
                    {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(ar[i]);
                        temp.add(ar[front]);
                        temp.add(ar[rear]);
                        Ar.add(temp);
                        while(front<rear && ar[front]==ar[front+1])
                        front++;
                        while(front<rear && ar[rear]==ar[rear-1])
                        rear--;
                        front++;
                        rear--;
                    }
                    else if(ar[front]+ar[rear]>sum) rear--;
                    else front++;
                }
            }
        }
        return Ar;
    }
    public static void main()
    {
        ThreeSum ob = new ThreeSum();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = obj.nextInt();
        int ar[] = new int[size];
        int i;
        System.out.println("Enter values");
        for(i=0;i<size;i++)
        ar[i] = obj.nextInt();
        List<List<Integer>> result = ob.threeSum(ar);
        for(i = 0;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }
    }
}