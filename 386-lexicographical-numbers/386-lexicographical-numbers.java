class Solution {
    private static void LexicoCount(int n,List<Integer> res,int val){
        if(val>n) return;
        //Method1
        {
        res.add(val);
        LexicoCount(n,res,val*10);
        if(val%10!=9) LexicoCount(n,res,val+1);
        }
        //Method2
        //{
        //if(val!=0) res.add(val);
        // for(int i=(val==0) ? 1 : 0 ; i<=9 ; i++){
        // LexicoCount(n,res,val*10+i);
        // }
        //}
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res=new LinkedList<>();
        //Method1
        LexicoCount(n,res,1);
        //Method2
        //LexicoCount(n,res,0);
        return res;
    }
}