class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> mp=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res=new LinkedList<>();
        for(Map.Entry<Integer,Integer> i:mp.entrySet()){
            if(i.getValue()>1) res.add(i.getKey());
        }
        return res;
    }
}