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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return insertRec(preorder,inorder,0,inorder.length-1);
    }
     int j = 0;
     TreeNode insertRec(int[] pre, int[] ino, int s, int e){
                if(s>e || j>pre.length-1){
                        return null;
                }
                TreeNode root = new TreeNode(pre[j]);
                int k = 0;
                for(int i = s;i<=e;i++){
                        if(ino[i]==pre[j]){
                                k = i;
                                break;
                        }
                }
                j++;
                 root.left = insertRec(pre, ino,s,k-1);
                root.right = insertRec(pre,ino,k+1,e);
                return root;
        }
}