class Solution {
    public boolean isPowerOfThree(int n) {
        return power((double)n);
    }
    boolean power(double n){
        if(n==3 || n==1) return true;
        if(n<3) return false;
        return power(n/3);
    }
}