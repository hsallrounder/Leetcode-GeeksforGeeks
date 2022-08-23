class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1,r=num,mid;
        while(l<=r){
mid=l+(r-l)/2;
if(num==mid*mid) return true;
 if(mid*mid<num) l=mid+1;
  else r=mid-1;
}
return false;


    }
}