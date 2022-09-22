class Solution {
    private String makeWrd(String s,int i,int j,String ans){
        if(j<i) return ans;
        return makeWrd(s,i,j-1,ans+s.charAt(j));
    }
    public String reverseWords(String s) {
        List<String> res=new ArrayList<>();
        for(int i=0,j=0;j<s.length();j++){
            if(j+1==s.length() || s.charAt(j+1)==' '){
                res.add(makeWrd(s,i,j,"").trim());
                i=j+1;
            }
        }
        return String.join(" ",res);
    }
}