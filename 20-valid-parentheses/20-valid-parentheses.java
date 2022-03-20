class Solution {
    public boolean isValid(String s) {
       if(s.length()==0 || s.length()==1){
            return false;
        }
        Stack<Character> st = new Stack();
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char e = str[i];
            if (e == '(' || e == '{' || e == '[') {
                st.push(str[i]);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char temp = st.pop();
                    if (e == ')' && temp!='(' || e == ']' && temp!='[' || e == '}' && temp!='{') {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}