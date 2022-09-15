class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int t=i+1,t_last=i+k;
            while(t<=t_last && t<n){
                if(nums[i]==nums[t]){
                    return true;
                }
                t++;
            }
        }
        return false;
    }
}