class Solution {
    public boolean exist(char[][] board, String word) {
        boolean res=false;
        int[] row = {-1,1,0,0};
        int[] col = {0,0,1,-1};
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    res = res || search(board,word,0,i,j,new boolean[board.length][board[0].length],row,col);
                }
            }
        }
        return res; 
    }
    private static boolean search(char[][] board,String word,int idx,int r,int c,boolean[][] vis,int[] row,int[] col){
        if(idx==word.length()) return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || vis[r][c] || board[r][c]!=word.charAt(idx)) return false;
        vis[r][c]=true;
        for(int i=0;i<row.length;i++){
            if(search(board,word,idx+1,r+row[i],c+col[i],vis,row,col)) return true;
        }
        vis[r][c]=false;
        return false;
    }
}