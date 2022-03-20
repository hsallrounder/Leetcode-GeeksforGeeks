class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList();
        for(int i : nums){
            arr.add(i);
        }
        HashSet<Integer> hs = new HashSet(arr);
        ArrayList<Integer> arr2=new ArrayList(hs);
        Collections.sort(arr2);
        for(int i=0;i< nums.length;i++){
            if(i<arr2.size()){
                nums[i]=arr2.get(i);
            }
            else {
                nums[i]=0;
            }
        }
        return arr2.size();
    }
}