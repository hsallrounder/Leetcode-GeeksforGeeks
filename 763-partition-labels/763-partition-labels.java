class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++) mp.put(s.charAt(i),i);
        int last_ind=0,pre_ind=-1;
        for(int i=0;i<s.length();i++){
            last_ind=Math.max(mp.get(s.charAt(i)),last_ind);
            if(last_ind==i){
                res.add(last_ind-pre_ind);
                pre_ind=last_ind;
            }
        }
        return res;
        
    }
}