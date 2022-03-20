class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)) map.replace(i,map.get(i)+1);
            else map.put(i,1);
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) arr1.add(entry.getValue());
        ArrayList<Integer> arr1st=new ArrayList(new HashSet(arr1));
        if(arr1.size()==arr1st.size()) return true;
        return false;
    }
}