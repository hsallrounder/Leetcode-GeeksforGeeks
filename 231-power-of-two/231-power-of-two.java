class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if(n==1) return true;
        long x=(long)n;
        return ((x & -x)==x);
    }
}