class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        Map<Integer,String> mp=new TreeMap<>();
        for(int i=0;i<str.length;i++){
            String val=str[i].substring(0,str[i].length()-1);
            int key=str[i].charAt(str[i].length()-1)-'0';
            mp.put(key,val);
        }
        String res="";
        for(Map.Entry<Integer,String> o:mp.entrySet()){
            res+=o.getValue()+" ";
        }
        return res.substring(0,res.length()-1);
    }
}