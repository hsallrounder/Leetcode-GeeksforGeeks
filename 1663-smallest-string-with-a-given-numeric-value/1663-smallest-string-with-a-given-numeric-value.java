class Solution {
    public String getSmallestString(int n, int k) {
        char[] res=new char[n];
        for(int i=0;i<n;i++){
            res[i]='a';
            k--;
        }
        int n_val;
        while (k > 0) {
            n_val = Math.min(25,k);
            res[--n] += n_val;
            k -= n_val;
        }
        return String.valueOf(res);
        
    }
}