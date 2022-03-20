class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int f=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    f=1;
                    break;
                }
            }
            if (f==1){
                break;
            }
        }
        return arr;
    }
}