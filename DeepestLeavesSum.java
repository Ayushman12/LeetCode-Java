import java.util.*;
public class DeepestLeavesSum
{
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        int h = maxDepth(root);
        return calculate(root,h);
    }
    private int calculate(TreeNode root,int h) {
        if(root==null) return 0;
        if(h==1)
            sum = sum+root.val;
        calculate(root.left,h-1);
        calculate(root.right,h-1);
        return sum;
        
    }
    private int maxDepth(TreeNode node)
    {
        if (node == null)
            return 0;
        else
        {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
    public static void main()
    {
        DeepestLeavesSum ob = new DeepestLeavesSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(7);
        System.out.println(ob.deepestLeavesSum(root));
    }
}
