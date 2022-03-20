class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
             if(x==0){
                 arr[0]=i;
                 arr[1]=i;
                 x=1;
             }
             else{
                 arr[1]=i;
                 continue;
             }
            }
            else{
                if(x==0){
                    continue;
                }
                break;
            }
        }
        if(x==0){
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}