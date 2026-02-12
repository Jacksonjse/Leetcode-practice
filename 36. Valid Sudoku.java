class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> st = new HashSet<>();
        for(int i=0; i<board[0].length; i++){
            for(int j=0; j<board[0].length; j++){
                char c = board[i][j];
                if(c!='.'){
                    if(!st.add(c+"row"+i) || !st.add(c+"col"+j) || !st.add(c+"box"+i/3+"-"+j/3)){
                    return false;
                    }
                }
            }
        }
        return true;
    }
}