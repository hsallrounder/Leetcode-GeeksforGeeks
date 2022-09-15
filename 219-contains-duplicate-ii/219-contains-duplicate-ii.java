class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k) st.remove(nums[i-k-1]);
            if(!st.add(nums[i])) return true;
        }
        return false;
    }
}