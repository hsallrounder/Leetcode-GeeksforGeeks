class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int s1size=s1.length();
        char[] a=s1.toCharArray();
        Arrays.sort(a);
        String a1=String.valueOf(a);
        for(int i=0;i<s2.length()-s1size+1;i++){
            char[] b=s2.substring(i,i+s1size).toCharArray();
            Arrays.sort(b);
            String b1=String.valueOf(b);
            if(a1.equals(b1)){
                return true;
            }
        }
        return false;
    }
}