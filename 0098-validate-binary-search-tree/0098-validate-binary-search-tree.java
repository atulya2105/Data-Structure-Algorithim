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
    public boolean isValidBST(TreeNode root) {
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean isBST(TreeNode root, long low, long high){
        if(root==null) return true;
        long curr = root.val;
        if(curr>=low && curr<=high){
            if(isBST(root.left,low,curr-1)&& isBST(root.right,curr+1,high))
                return true;
            else
                return false;
        }
        return false;
    }
}