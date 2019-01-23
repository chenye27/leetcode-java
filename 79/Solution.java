class Solution {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        for(int i = 0;i< board.length;i++){
            for(int j =0;j< board[0].length;j++){
                if(find(board,i,j,0,w)) return true;
            }
        }
        return false;
    }
    
    public boolean find(char[][] board,int x,int y,int temp,char[] word){
        if(temp == word.length  ) return true;
        if(x<0 || y<0 || x>=board.length || y >= board[0].length) return false;
        if(board[x][y] == word[temp]){
            board[x][y] ^= 256;
            boolean ex= find(board,x+1,y,temp+1,word) || find(board,x,y+1,temp+1,word) ||find(board,x,y-1,temp+1,word) || find(board,x-1,y,temp+1,word);
            board[x][y] ^= 256;
            return ex;
        }else return false;
      
    }
}