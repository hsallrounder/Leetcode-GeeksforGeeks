class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq=new int[26];
        for(int i=0;i<tiles.length();i++){
            freq[tiles.charAt(i)-'A']+=1;
        }
        return possibility(freq,tiles);
    }
    private static int possibility(int[] freq,String ans){
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=1){
                char ch=(char) (i+'A');
                freq[i]--;
                count+=possibility(freq,ans+ch)+1;
                freq[i]+=1;
            }
        }
        return count;
    }
}