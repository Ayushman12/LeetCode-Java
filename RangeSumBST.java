import java.util.*;
public class RangeSumBST
{
    private int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        if(root.val<low) rangeSumBST(root.right,low,high);
        if(root.val>high) rangeSumBST(root.left,low,high);
        if(root.val>=low && root.val<=high) {
            //System.out.println("Adding "+root.val+" to "+sum);
            sum+=root.val;
            rangeSumBST(root.right,low,high);
            rangeSumBST(root.left,low,high);
        }
        return sum;
    }
    public static void main()
    {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        RangeSumBST ob = new RangeSumBST();
        System.out.println("Sum = "+ob.rangeSumBST(root,4,9));
    }
}
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
