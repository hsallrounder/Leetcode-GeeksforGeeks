class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=1,low=1;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        int m,k;
        while(low<high){
            m=(low+high)/2;
            k=0;
            for(var i : piles){
                k+=Math.ceil((double)i/m);
            }
            if(k<=h) high=m;
            else low=m+1;
        }
        return high;
    }
}