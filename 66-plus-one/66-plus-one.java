class Solution {
    public int[] plusOne(int[] digits) {
        int ctr=0,carry=1;
        for(int i:digits){
            if(i==9){
                ctr++;
            }
        }
        int arr[];
        if(ctr==digits.length){
            arr=new int[digits.length+1];
            for(int i=arr.length-1;i>0;i--){
                arr[i]=digits[i-1]+carry;
                if(arr[i]==10){
                    arr[i]=0;
                    carry=1;
                }
                else {
                    carry=0;
                }
            }
            arr[0]=1;
        }
        else {
            arr=new int[digits.length];
            for(int i=digits.length-1;i>=0;i--){
                arr[i]=digits[i]+carry;
                if(arr[i]==10){
                    arr[i]=0;
                    carry=1;
                }
                else {
                    carry=0;
                }
            }
        }
        return arr;
    }
}