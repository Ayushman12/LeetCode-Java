/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SumBST {
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
}