class Solution {
    public String longestCommonPrefix(String[] strs) {
        int x=0;
        for(int i=0;i<strs.length-1;i++){
            if(strs[i].length()<strs[i+1].length()){
                x=i;
            }
            else {
                x=i+1;
            }
        }
        String small = strs[x];
        for(int i=0;i<small.length();i++) {
            String s = small.substring(0, small.length() - i);
            int f = 1;
            for (String j : strs) {
                if (!j.startsWith(s)) {
                    f = 0;
                    break;
                }
            }
            if(f==1) return s;
        } return "";
    }
}