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
    TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key>root.val){
            root.right = deleteNode(root.right,key);
        }else if(key<root.val){
            root.left = deleteNode(root.left,key);
        }else{
            if(root.right==null && root.left==null) return null;
            else if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                TreeNode temp = minValue(root.right);
                root.val = temp.val;
                root.right = deleteNode(root.right,temp.val);
            }
        }
        return root;
    }
    TreeNode minValue(TreeNode root){
        if(root==null) return null;
        if(root.left==null) return root;
        return minValue(root.left);
    }
}