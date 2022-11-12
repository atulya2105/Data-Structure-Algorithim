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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int n = s1.size();
            while(!s1.empty()){
                TreeNode node = s1.pop();
                if(node.left!=null){
                    s2.push(node.left);
                }
                if(node.right!=null){
                    s2.push(node.right);
                }
                temp.add(node.val);
                
            }
            ans.add(temp);
            temp = new ArrayList<>();
            while(!s2.empty()){
                TreeNode node = s2.pop();
                if(node.right!=null){
                    s1.push(node.right);
                }
                if(node.left!=null){
                    s1.push(node.left);
                }
                temp.add(node.val);
            }
            if(temp.size()!=0){
                ans.add(temp);
            }
        }
        return ans;
    }
    
}    
    