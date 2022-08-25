class Solution {
    private void arrRev(int[] arr,int st,int end){
		for(int i=st,j=end;i<j;i++,j--) {
			arr[i]=arr[i]^arr[j];
			arr[j]=arr[j]^arr[i];
			arr[i]=arr[i]^arr[j];
		}
	}
    public void rotate(int[] nums, int k) {
        int arL=nums.length;
        k=k%arL;
        arrRev(nums,0,arL-k-1);
        arrRev(nums,arL-k,arL-1);
        arrRev(nums,0,arL-1);
    }
}