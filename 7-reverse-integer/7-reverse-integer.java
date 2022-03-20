class Solution {
    public int reverse(int x) {
        int rev=0;
        int n=Math.abs(x);
        while(n>0){
            int r=n%10;
            n/=10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE && r>7) return 0;
            rev=rev*10+r;
        }
        return x<0 ? -rev : rev;
    }
}