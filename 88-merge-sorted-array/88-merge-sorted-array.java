class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m+n-1,j=n-1;i>m-1;i--,j--){
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
    }
}