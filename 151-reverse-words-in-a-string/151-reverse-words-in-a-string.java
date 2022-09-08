class Solution {
    public String reverseWords(String s) {
        String[] str=s.split("\s+");
        String res="";
        for(int i=str.length-1;i>=0;i--){
            res+=str[i];
            if(i-1>-1) res+=" ";
        }
        return res.trim();
    }
}

