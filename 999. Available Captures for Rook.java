class Solution {
    public int numRookCaptures(char[][] board) {
        int rookRow = 0;
        int rookCol = 0;
        int count = 0;
        for(int i = 0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if (board[i][j]=='R'){
                    rookRow = i;
                    rookCol = j;
                }
            }
        }
        for(int up = rookRow-1; up>=0; up--){
            if(board[up][rookCol] == 'B') break;
            else if(board[up][rookCol] == 'p'){
                count++;
                break;
            }
        }
        for(int down = rookRow+1; down<board.length; down++){
            if(board[down][rookCol]  == 'B') break;
            else if(board[down][rookCol] == 'p'){
                count++;
                break;
            }
        }
        for(int left = rookCol-1; left>=0; left--){
            if(board[rookRow][left] == 'B') break;
            else if(board[rookRow][left] == 'p'){
                count++;
                break;
            }
        }
        for(int right = rookCol+1; right<board.length; right++){
            if(board[rookRow][right] == 'B') break;
            else if(board[rookRow][right] == 'p'){
                count++;
                break;
            }
        }
        return count;
    }
}