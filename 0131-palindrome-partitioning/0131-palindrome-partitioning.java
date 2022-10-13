class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new LinkedList<>();
        partiton(s,new LinkedList<>(),res);
        return res;
    }
    private static void partiton(String ques,List<String> curAns,List<List<String>> res){
        if(ques.length()==0){
            res.add(new LinkedList<>(curAns));
            return;
        }
        for(int cut=1;cut<=ques.length();cut++){
            String s=ques.substring(0,cut);
            if(isPal(s)) {
                curAns.add(s);
                partiton(ques.substring(cut),curAns,res);
                curAns.remove(curAns.size()-1);
            }   
        }
    }
    private static boolean isPal(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}