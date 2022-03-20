class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sw= s.split(" ");
        if(sw.length!=pattern.length()) return false;
        Map<Character,String> mp = new HashMap();
        Set<String> w_set = new HashSet(Arrays.asList(sw));
        Set<Character> p_set = new HashSet(Arrays.asList(pattern.split("")));
        if(w_set.size()!=p_set.size()) return false;
        for(int i=0;i<sw.length;i++){
            if(mp.containsKey(pattern.charAt(i))) {
                if(!mp.get(pattern.charAt(i)).equals(sw[i])) return false;
            }
            else mp.put(pattern.charAt(i),sw[i]);
        }
        return true;
    }
}