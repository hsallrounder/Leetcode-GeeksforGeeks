class Solution {
    private static int sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,2);
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Map<Integer,Integer> mp=new HashMap<>();
        while(n!=1 && !mp.containsKey(n)){
            mp.put(n,sum(n));
            n=mp.get(n);
        }
        if(n==1) return true;
        return false;
    }
}