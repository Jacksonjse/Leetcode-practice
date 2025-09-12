class Solution {
    public String tictactoe(int[][] moves){
        //filling an empty board
        char[][] board = new char[3][3];
        for(int i =0; i<3; i++){
            for(int j = 0; j<3; j++){
                board[i][j] = '.';
            }
        }

        //assigning the given moves and its char to the board
        char turn = 'X';
        for(int[] x:moves){
            board[x[0]][x[1]] = turn;
            turn = (turn=='X')?'O':'X';
        }

        //checking rows and columns
        for(int i=0; i<3; i++){
            if( (board[i][0] != '.') && (board[i][0] == board[i][1]) && (board[i][1] == board[i][2]) ){
                return (board[i][0]=='X')?"A":"B";
            }
            else if( (board[0][i] != '.') && (board[0][i] == board[1][i]) && (board[1][i] == board[2][i]) ){
                return (board[0][i]=='X')?"A":"B";
            }
        }

        if( (board[1][1] != '.') && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) ){
            return (board[0][0] == 'X')?"A":"B";
        }
        else if( (board[1][1] != '.') && (board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) ){
            return (board[0][2] == 'X')?"A":"B";
        }

        if(moves.length == 9){
            return "Draw";
        }
        else{
            return "Pending";
        }
    }
}