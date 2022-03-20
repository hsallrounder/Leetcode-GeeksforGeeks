class Solution {
    public int search(int[] nums, int target) {
        int ind=0;
        boolean hai=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) { 
                ind=i;
                hai=true;
            }
        }
        if(hai) return ind;
        return -1;
    }
}