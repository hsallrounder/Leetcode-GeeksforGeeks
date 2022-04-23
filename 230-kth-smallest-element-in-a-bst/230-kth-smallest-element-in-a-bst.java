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
    static int i,kth_res;
    static boolean flag;
    void utility(TreeNode root,int k){
        if(root==null || flag==false) return;
        utility(root.left,k);
        i++;
        if(i==k) {
            kth_res=root.val;
            flag=false;
        }
        utility(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        i=0;
        flag=true;
        int[] arr=new int[1];
        utility(root,k);
        return kth_res;
    }
}