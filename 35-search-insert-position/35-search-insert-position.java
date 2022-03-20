class Solution {
    public int searchInsert(int[] nums, int target) {
        int x=0,ctr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                x=i;
                break;
            }
            else if(nums[i]>target){
                if(i==0){
                    x=i;
                    break;
                }
                else {
                    x=i;
                    break;
                }
            }
            ctr++;
        }
        if(ctr==nums.length){
            x= nums.length;
        }
        return x;
    }
}