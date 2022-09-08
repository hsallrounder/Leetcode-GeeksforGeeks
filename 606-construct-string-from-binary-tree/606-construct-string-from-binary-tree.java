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
    static String res;
   private static String tree2strANS;
    public String tree2str(TreeNode root) {
        res="";
        pre(root);
        return res;
    }
    private static void pre(TreeNode root){
        if(root==null) return;
        res+=root.val;
        if(root.left==null && root.right==null) return;
        res+="(";
        pre(root.left);
        res+=")";
        if(root.right!=null){
            res+="(";
            pre(root.right);
            res+=")";
        }
    }
}