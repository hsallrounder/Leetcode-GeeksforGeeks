class Solution {
    public boolean isPowerOfTwo(int n) {
        return power((double)n);
    }
    boolean power(double n){
        if(n==2 || n==1) return true;
        if(n<2) return false;
        return power(n/2);
    }
}