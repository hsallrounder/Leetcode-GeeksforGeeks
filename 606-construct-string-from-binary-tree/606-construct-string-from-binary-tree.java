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
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        Stack<TreeNode> st=new Stack<>();
        Set<TreeNode> vis=new HashSet<>();
        st.push(root);
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            root=st.peek();
            if(vis.contains(root)){
                st.pop();
                res.append(")");
            }
            else{
                vis.add(root);
                res.append("("+root.val);
                if(root.left==null && root.right!=null) res.append("()");
                if(root.right!=null) st.push(root.right);
                if(root.left!=null) st.push(root.left);
            }
        }
        return res.substring(1,res.length()-1);
    }
}