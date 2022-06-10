class Solution {
    public int lengthOfLongestSubstring(String s) {
    int i=0,j=0;
    int max_len=0;
    Set<Character> st = new HashSet<>();
    while(j<s.length()){
        if(!st.contains(s.charAt(j))) {
            st.add(s.charAt(j));
            j++;
            max_len = Math.max(max_len,st.size());
        }
        else{
            st.remove(s.charAt(i));
            i++;
        }
    }
    return max_len;
    }
}