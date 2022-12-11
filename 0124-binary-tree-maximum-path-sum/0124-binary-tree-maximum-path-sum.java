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
class Solution {
    int mx = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return mx;
    }
    int helper(TreeNode root){
        if(root==null) return 0;
        int lh = Math.max(0,helper(root.left));
        int rh = Math.max(0,helper(root.right));
        mx = Math.max(mx,lh+rh+root.val);
        return root.val+Math.max(lh,rh);
    }
}