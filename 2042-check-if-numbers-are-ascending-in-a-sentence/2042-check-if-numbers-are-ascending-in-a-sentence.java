class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        int prev=Integer.MIN_VALUE,cur;
        for(int i=0;i<str.length;i++){
            if(Character.isDigit(str[i].charAt(0))){
                cur=Integer.parseInt(str[i]);
                if(cur<=prev) return false;
                prev=cur;
            }
        }
        return true;
    }
}