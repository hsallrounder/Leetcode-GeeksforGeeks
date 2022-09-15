class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mp.containsKey(nums[i])){
                List<Integer> t=new ArrayList<>();
                t.add(i);
                mp.put(nums[i],t);
            }
            else{
                List<Integer> t=mp.get(nums[i]);
                for(int ind:t){
                    if(Math.abs(i-ind)<=k) return true;
                }
                t.add(i);
                mp.put(nums[i],t);
            }
        }
        return false;
    }
}