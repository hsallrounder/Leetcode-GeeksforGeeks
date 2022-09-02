class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n= nums.length;
        if (n == 1) return nums[0];
        int sum=nums[0],cur_max=nums[0],cur_min=nums[0];
        int min_sum=nums[0],max_sum=nums[0];
        for(int i=1;i<n;i++){
            sum+=nums[i];
            cur_max=Math.max(cur_max+nums[i],nums[i]);
            max_sum=Math.max(max_sum,cur_max);
            cur_min=Math.min(cur_min+nums[i],nums[i]);
            min_sum=Math.min(min_sum,cur_min);
        }
        if(min_sum==sum) return max_sum;
        return Math.max(max_sum,sum-min_sum);
    }
}