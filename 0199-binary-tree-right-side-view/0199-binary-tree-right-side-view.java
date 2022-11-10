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
    int mxLevel = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        post(root,1,ans);
        return ans;
    }
    public void post(TreeNode root, int level, List<Integer> ans){
        if(root==null) return;
        if(mxLevel<level){
            ans.add(root.val);
            mxLevel = level;
        }
        post(root.right,level+1,ans);
        post(root.left,level+1,ans);
    }
}