class Solution {
    private static void arrRev(int[] arr,int st,int end){
        for(int i=st,j=end;i<j;i++,j--) {
            arr[i]=arr[i]^arr[j];
            arr[j]=arr[j]^arr[i];
            arr[i]=arr[i]^arr[j];
        }
    }
    public void nextPermutation(int[] nums) {
        int d=nums.length-2;
        while(d>=0 && nums[d+1]<=nums[d]) d--;
        if(d>=0) {
            int i = nums.length-1;
            while (nums[i]<=nums[d]) i--;
            nums[i] ^= nums[d];
            nums[d] ^= nums[i];
            nums[i] ^= nums[d];
        }
        arrRev(nums,d+1,nums.length-1);
    }
}