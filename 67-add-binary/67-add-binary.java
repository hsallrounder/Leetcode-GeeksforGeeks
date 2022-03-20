class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        while(i>=0 && j>=0){
            if(a.charAt(i)==b.charAt(j)){
                if(a.charAt(i)=='0') {
                    if (carry == 0) {
                        sum.append("0");
                    }
                    else {
                        sum.append("1");
                        carry=0;
                    }
                }
                else {
                    if(carry==0){
                        sum.append("0");
                    }
                    else {
                        sum.append("1");
                    }
                    carry=1;
                }
            }
            else {
                if(a.charAt(i)=='0'){
                    if(carry==0){
                        sum.append("1");
                    }
                    else {
                        sum.append("0");
                    }
                }
                else {
                    if(carry==0){
                        sum.append("1");
                    }
                    else {
                        sum.append("0");
                    }
                }
            }
            j--;i--;
        }
        while(i>=0){
            if(a.charAt(i)=='0'){
                if(carry==0){
                    sum.append("0");
                }
                else {
                    sum.append("1");
                    carry=0;
                }
            }
            else {
                if(carry==0){
                    sum.append("1");
                }
                else {
                    sum.append("0");
                }
            }
            i--;
        }
        while(j>=0){
            if(b.charAt(j)=='0'){
                if(carry==0){
                    sum.append("0");
                }
                else {
                    sum.append("1");
                    carry=0;
                }
            }
            else {
                if(carry==0){
                    sum.append("1");
                }
                else {
                    sum.append("0");
                }
            }
            j--;
        }
        if(carry==1){
            sum.append("1");
        }
        return sum.reverse().toString();
    }
}