class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<3) return true;
        int y1,y2,y3,x1,x2,x3;
        for(int i=0;i<coordinates.length-2;i++){
          x1=coordinates[i][0];
          y1=coordinates[i][1];
          x2=coordinates[i+1][0];
          y2=coordinates[i+1][1];
          x3=coordinates[i+2][0];
          y3=coordinates[i+2][1];
          if((y2-y1)*(x3-x2)!=(y3-y2)*(x2-x1)) return false;

}
        return true;
    }
}