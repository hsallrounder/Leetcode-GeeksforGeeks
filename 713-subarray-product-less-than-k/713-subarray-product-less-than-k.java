class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res=0,start=0,prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            while(prod>=k && start<=i){
                prod/=nums[start];
                start++;
            }
            res+=i-start+1;
        }
        return res;
    }
}