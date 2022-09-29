class Solution {
    private static void generate(int n,List<String> res,int open,int close,String ans){
        if(close+open==2*n){
            res.add(ans);
            return;
        }
        if(open<n) {
            generate(n,res,open+1,close,ans+'(');
        }
        if(close<open){
            generate(n,res,open,close+1,ans+')');
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new LinkedList<>();
        generate(n,res,0,0,"");
        return res;
    }
}