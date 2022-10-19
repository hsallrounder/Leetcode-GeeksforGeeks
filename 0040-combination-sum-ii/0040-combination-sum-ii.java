class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new LinkedList<>();
        Arrays.sort(candidates);
        combination(candidates,0,target,res,new LinkedList<>());
        return res;
    }
    private static void combination(int [] candidates,int idx,int target,List<List<Integer>> res,List<Integer> ans){
        if(target==0){
            res.add(new LinkedList<>(ans));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(target<candidates[i]) return;
                ans.add(candidates[i]);
                combination(candidates,i+1,target-candidates[i],res,ans);
                ans.remove(ans.size()-1);
            
        }
    }
}