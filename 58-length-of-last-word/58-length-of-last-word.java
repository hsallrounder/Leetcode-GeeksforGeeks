class Solution {
    public int lengthOfLastWord(String s) {
        int l=0,x=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && x==0){
                continue;
            }
            if(s.charAt(i)==' ' && x==1){
                break;
            }
            l++;
            x=1;
        }
        return l;
    }
}