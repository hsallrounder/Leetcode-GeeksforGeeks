/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long start=1,end=n;
        int mid;
        while(start<=end){
            mid=(int)(start+(end-start)/2);
            if(isBadVersion(mid)){
                if(isBadVersion(mid-1)){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
            else if(!isBadVersion(mid)){
                if(isBadVersion(mid+1)){
                    return mid+1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}