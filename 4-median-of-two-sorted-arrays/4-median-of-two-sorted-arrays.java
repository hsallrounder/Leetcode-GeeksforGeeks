class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList();
        for(int i : nums1){
            arr.add(i);
        }
        for (int i:nums2){
            arr.add(i);
        }
        Collections.sort(arr);
        if(arr.size()%2!=0){
            return arr.get(arr.size()/2);
        }
        else {
            return (arr.get(arr.size()/2)+arr.get((arr.size()/2)-1))/2.00000;
        }
    }
}