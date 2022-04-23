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
    static int i;
    static boolean flag;
    void utility(TreeNode root,int k,int[] arr){
        if(root==null || !flag) return;
        utility(root.left,k,arr);
        i++;
        System.out.println(i+" "+ root.val);
        if(i==k) {
            arr[0]=root.val;
            flag=false;
        }
        utility(root.right,k,arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        i=0;
        flag=true;
        int[] arr=new int[1];
        utility(root,k,arr);
        return arr[0];
    }
}