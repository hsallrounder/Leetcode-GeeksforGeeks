class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,y=0;
        while(temp>0){
            y=(y*10)+(temp%10);
            temp/=10;
        }
        if(y==x){
            return true;
        }
        return false;
    }
}