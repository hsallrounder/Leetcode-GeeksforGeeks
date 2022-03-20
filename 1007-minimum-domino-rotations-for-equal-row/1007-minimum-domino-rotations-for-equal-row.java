class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {   
        int[] frq1 = new int[7];
        int[] frq2 = new int[7];
        int[] same = new int[7];
        for(int i=0;i<tops.length;i++){
            frq1[tops[i]]++;
            frq2[bottoms[i]]++;
            if(tops[i]==bottoms[i])
                same[tops[i]]++;
        }
        for(int i=1;i<7;i++){
            if(frq1[i]+frq2[i]-same[i]==tops.length)
                return tops.length - Math.max(frq1[i],frq2[i]);
        }
        return -1;
    }
}