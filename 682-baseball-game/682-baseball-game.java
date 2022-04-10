class Solution {
    public int calPoints(String[] ops) {
        int sum=0;
        Stack<Integer> res=new Stack();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("+")){
                res.push(res.peek()+res.get(res.size()-2));
            }
            else if(ops[i].equals("C")){
                res.pop();
            }
            else if(ops[i].equals("D")){
                res.push(res.peek()*2);
            }
            else{
                res.push(Integer.valueOf(ops[i]));
            }
        }
        for(int i:res) sum+=i;
        return sum;
    }
}