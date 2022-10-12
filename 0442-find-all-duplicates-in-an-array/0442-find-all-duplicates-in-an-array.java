class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> st=new HashSet<>();
        List<Integer> res=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(!st.add(nums[i])) res.add(nums[i]);
        }
        return res;
    }
}