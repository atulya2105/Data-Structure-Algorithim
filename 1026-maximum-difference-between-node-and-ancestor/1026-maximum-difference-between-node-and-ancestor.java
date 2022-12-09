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
    int ans = 0;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        return helper(root,root.val,root.val);
    }
    int helper(TreeNode node, int mx, int mn){
        if(node==null) return mx-mn;
        
        mx = Math.max(mx,node.val);
        mn = Math.min(mn,node.val);
        int left =  helper(node.left,mx,mn);
        int right =  helper(node.right,mx,mn);
        return Math.max(left,right);
    }
}