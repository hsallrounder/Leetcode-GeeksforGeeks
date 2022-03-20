class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currgas=0;
        int r_gas=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            currgas+=gas[i]-cost[i];
            if(currgas<0){
                index=i+1;
                r_gas+=currgas;
                currgas=0;
            }
        }
        return r_gas+currgas>=0 ? index : -1;
    }
}