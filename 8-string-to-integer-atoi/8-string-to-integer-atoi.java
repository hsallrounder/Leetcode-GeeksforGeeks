class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() && s.charAt(i)!='-' && s.charAt(i)!='+' && s.charAt(i)!='+'  && s.charAt(i)!='0'
                && s.charAt(i)!='1'  && s.charAt(i)!='2' && s.charAt(i)!='3'
                && s.charAt(i)!='4' && s.charAt(i)!='5' && s.charAt(i)!='6'
                && s.charAt(i)!='7' && s.charAt(i)!='8' && s.charAt(i)!='9') return 0;
        int n=0;
        boolean neg=false;
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            neg=s.charAt(i)=='-';
            i++;
        }
        char st;
        for(;i<s.length();i++){
            st=s.charAt(i);
            if(st!='0' && st!='1'  && st!='2' && st!='3'
                    && st!='4' && st!='5' && st!='6'
                    && st!='7' && st!='8' && st!='9') break;
            if(n>Integer.MAX_VALUE/10 || (n==Integer.MAX_VALUE/10 && (st-'0')>Integer.MAX_VALUE%10)){
                return (neg ? Integer.MIN_VALUE : Integer.MAX_VALUE);
            }
            n=(n*10)+(st-'0');
        }
        return neg ? -n : n;
    }
}