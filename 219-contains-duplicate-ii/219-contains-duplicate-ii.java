class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        if(n<2) return false;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                if(i-mp.get(nums[i])<=k) return true;
            }
            mp.put(nums[i],i);
        }
        return false;
    }
}