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
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(nums,0,nums.length-1);
    }
    
    TreeNode BST(int [] nums, int start , int end){
        if(end<start){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode l = new TreeNode(nums[mid]);
        l.left = BST(nums,start,mid-1);
        l.right = BST(nums,mid+1,end);
        return l;
  }
}