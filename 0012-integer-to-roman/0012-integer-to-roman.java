class Solution {
    public String intToRoman(int num) {
        int iarr[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sarr[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer res=new StringBuffer();
        for(int i=0;i<iarr.length;i++){
            while(num>=iarr[i]) {
                num-=iarr[i];
                res.append(sarr[i]);
            }
        }
        return res.toString();
    }
}