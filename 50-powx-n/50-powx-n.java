class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x==1){
            return 1;
        }
        if(x == -1) {
            if (n % 2 == 0) {
                return 1;
            }
            return -1;
        }
        if(n == Integer.MIN_VALUE || n == Integer.MAX_VALUE){
            return 0;
        }
        if(n<0){
            return 1/x * myPow(1/x,-(n+1));
        }
        return x*myPow(x,n-1);
    }
}