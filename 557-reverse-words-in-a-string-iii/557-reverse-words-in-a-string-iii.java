class Solution {
    public String reverseWords(String s) {
        String res="";
        String temp="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                temp=s.charAt(i)+temp;
            }
            else{
                if(res.length()!=0) res+=" "; 
                res+=temp.trim();
                temp="";
            }
            if(i+1==s.length()){
                if(res.length()!=0) res+=" ";
                res+=temp.trim();
            }
            
        }
        return res;
    }
}