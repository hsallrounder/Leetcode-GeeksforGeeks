class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> arr=new ArrayList<>();
        int cur,num=0;
        int start=0;
        for(int i=1;i<=Integer.toString(low).length();i++){
            start=(start*10)+i;
            num=(num*10)+1;
        }
        cur=start;
        while(Integer.toString(cur).length()<=Integer.toString(high).length() && cur<=high){
            if(cur>=low){
                arr.add(cur);
            }
            if(cur%10==9) {
                num=(num*10)+1;
                cur=(start)*10+((start%10)+1);
                start=cur;
            }
            else {
                cur += num;
            }
        }
        return arr;
    }
}