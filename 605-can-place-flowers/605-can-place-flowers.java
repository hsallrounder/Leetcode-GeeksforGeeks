class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s= flowerbed.length,c=0;
        for(int i=0;i<s && c<n;i++){
            if(flowerbed[i]==0){
                int next = (i==s-1) ? 0 : flowerbed[i+1];
                int prev = (i==0) ? 0 : flowerbed[i-1];
                if(next==0 && prev==0){
                    flowerbed[i]=1;c++;
                }
            }
        }
        return c==n;
    }
}