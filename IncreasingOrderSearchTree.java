import java.util.*;
public class IncreasingOrderSearchTree
{
    private TreeNode temp = new TreeNode();
    private TreeNode ans = temp;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        increasingBST(root.left);
        temp.right = new TreeNode(root.val);
        temp = temp.right;
        increasingBST(root.right);
        return ans.right;
    }
    public static void main()
    {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(7);
        root.left.right= new TreeNode(8);
        IncreasingOrderSearchTree ob = new IncreasingOrderSearchTree();
        TreeNode ans = ob.increasingBST(root);
    }
}

