class Solution {
    public boolean winnerSquareGame(int n) {
        boolean []arr=new boolean[n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j*j<=i;j++){
                if(!arr[i-j*j]){
                    arr[i]=true;
                    break;
                }
            }
        }
        return arr[n];
    }
}