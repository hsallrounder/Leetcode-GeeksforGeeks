import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isMatch(String s, String p) {
        Matcher m=Pattern.compile(p).matcher(s);
        while(m.find()){
            if(m.group().equals(s)) return true;
            break;
        }
        return false;
    }
}