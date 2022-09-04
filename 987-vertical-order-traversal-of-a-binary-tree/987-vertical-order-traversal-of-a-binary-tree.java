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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        utility(root, mp, 0, 0);
        List<List<Integer>> ans = new LinkedList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> tr : mp.values()){
            List<Integer> temp = new LinkedList<>();
            for(PriorityQueue<Integer> pq : tr.values()) {
                while(!pq.isEmpty()){
                    temp.add(pq.poll());
                }
            }
            ans.add(temp);
        }
        return ans;
    }

    private void utility(TreeNode root, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mp, int x, int y) {
        if (root != null) {
            TreeMap<Integer, PriorityQueue<Integer>> temp_tree = mp.getOrDefault(y, new TreeMap<>());
            PriorityQueue<Integer> temp_queue = temp_tree.getOrDefault(x,new PriorityQueue<>());
            temp_queue.add(root.val);
            temp_tree.put(x, temp_queue);
            mp.put(y,temp_tree);
            utility(root.left, mp, x + 1, y - 1);
            utility(root.right, mp, x + 1, y + 1);
        }
    }
}