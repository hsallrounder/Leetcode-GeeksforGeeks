import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        Pattern p =Pattern.compile("[a-z0-9]");
        Matcher m = p.matcher(s.toLowerCase());
        while(m.find()){
            res.append(m.group());
        }
        System.out.println(res);
        System.out.println(res.reverse());
        for (int i = 0,j=res.length()-1; i<j;i++,j--) {
            if (res.charAt(i) != res.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}