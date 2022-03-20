class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        int x=needle.length();
        for(int i=0;i<haystack.length()-x+1;i++){
            if(haystack.substring(i,i+x).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}