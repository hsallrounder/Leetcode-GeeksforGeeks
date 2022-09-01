/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1,end=n,mid,ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                if(isBadVersion(mid-1)){
                    end=mid-1;
                }
                else{
                    ans=mid;
                    break;
                }
            }
            else if(!isBadVersion(mid)){
                if(isBadVersion(mid+1)){
                    ans=mid+1;
                    break;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}