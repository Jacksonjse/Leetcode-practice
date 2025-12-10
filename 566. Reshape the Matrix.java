class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (mat.length * mat[0].length != r * c)
            return mat;

        int ans[][] = new int[r][c];
        int a = 0, b = 0;
        for (int row[] : mat){
            for (int n : row){
                ans[a][b++] = n;

                if (b == c){
                    b = 0;
                    a++;
                }
            }
        }

        return ans;
    }
}