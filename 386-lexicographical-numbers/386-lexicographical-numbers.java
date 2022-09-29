class Solution {
    private static void LexicoCount(int n,List<Integer> res,int val){
        if(val>n) return;
        res.add(val);
        LexicoCount(n,res,val*10);
        if(val%10!=9) LexicoCount(n,res,val+1);
        
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res=new LinkedList<>();
        LexicoCount(n,res,1);
        return res;
    }
}