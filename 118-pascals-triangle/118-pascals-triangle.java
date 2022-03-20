class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        List<Integer> arr;
        for(int i=0;i<numRows;i++){
            arr=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) arr.add(1);
                else arr.add(tri.get(i-1).get(j-1)+tri.get(i-1).get(j));
            }
            tri.add(arr);
        }
        return tri;
    }
}