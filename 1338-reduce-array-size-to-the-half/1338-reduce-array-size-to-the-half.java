class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int newar[]=new int[mp.size()];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            newar[i++]=entry.getValue();
        }
        Arrays.sort(newar);
        int res=0,l=0;
        for(i=newar.length-1;i>=0;i--){
            res+=newar[i];
            l++;
            if(res>=arr.length/2){
                break;
            }
        }
        return l;
    }
}