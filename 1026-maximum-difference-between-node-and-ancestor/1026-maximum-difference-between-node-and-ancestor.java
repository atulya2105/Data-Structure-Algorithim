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
        helper(root,root.val,root.val);
        return ans;
    }
    void helper(TreeNode node, int mx, int mn){
        if(node==null) return ;
        int temp = Math.max(Math.abs(mx-node.val),Math.abs(mn-node.val));
        ans = Math.max(temp,ans);
        mx = Math.max(mx,node.val);
        mn = Math.min(mn,node.val);
        helper(node.left,mx,mn);
        helper(node.right,mx,mn);
        return;
    }
}