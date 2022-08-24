class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        List<String> res=new ArrayList<>();
        Map<Integer,String> mp=new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        String t=mp.get(digits.charAt(0)-'0');
        Stack<String> st1=new Stack<>();
        for(int i=0;i<t.length();i++)  st1.push(t.substring(i,i+1));
        Stack<String> st2;
        if(digits.length()!=1){
            for(int i=1;i<digits.length();i++){
                st2=new Stack<>();
                String temp=mp.get(digits.charAt(i)-'0');
                while(!st1.isEmpty()){
                    String p=st1.pop();
                    for(int j=0;j<temp.length();j++){
                        String np=p+temp.charAt(j);
                        st2.push(np);
                    }
                }
                st1=st2;
            }
        }
        while(!st1.isEmpty()) res.add(st1.pop());
        return res;
    }
}