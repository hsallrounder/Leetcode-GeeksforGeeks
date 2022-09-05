class Solution {
    private int f(int[] memo,int n){
        if(memo[n]==0){
            if(n<2) memo[n]=n;
            else memo[n]=f(memo,n-1)+f(memo,n-2);
        }
        return memo[n];
    }
    public int fib(int n) {
        return f(new int[n+1],n);
    }
}