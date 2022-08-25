class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> rN =new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            rN.put(c,rN.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> mz =new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            mz.put(c,mz.getOrDefault(c,0)+1);
        }
        for(Character m:rN.keySet()){
            if(!mz.containsKey(m)) return false;
            if(rN.get(m)>mz.get(m)) return false;
        }
        return true;
    }
}