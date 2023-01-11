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
    class Node {
        TreeNode node;
        int level;
        
        public Node(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        
        PriorityQueue<Node> q = new PriorityQueue<>((a, b) -> (a.level == b.level) ? Integer.compare(a.node.val, b.node.val) : Integer.compare(a.level, b.level));
        
        q.offer(new Node(root, 0));
        
        while (!q.isEmpty()) {
            PriorityQueue<Node> q1 = new PriorityQueue<>((a, b) -> (a.level == b.level) ? Integer.compare(a.node.val, b.node.val) : Integer.compare(a.level, b.level));
            
            for (int k = q.size(); k > 0; k--) {
                Node cur = q.poll();
                map.putIfAbsent(cur.level, new ArrayList<>());
                map.get(cur.level).add(cur.node.val);
                if (cur.node.left != null) {
                    q1.offer(new Node(cur.node.left, cur.level - 1));
                }   

                if (cur.node.right != null) {
                    q1.offer(new Node(cur.node.right, cur.level + 1));
                }  
            }
            q = q1;
        }
        
        return new ArrayList<List<Integer>>(map.values());
    }
}