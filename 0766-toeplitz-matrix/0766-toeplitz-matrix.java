class Solution {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}


// (0,0) (0,1) (0,2) (0,3)
// (1,0) (1,1) (1,2) (1,3)
// (2,0) (2,1) (2,2) (2,3)

// pairs would be, [(1,0), (2,1)], [(0,0), (1,1), (2,2)], [(0,1), (1,2), (2,3)], [(0,2), (1,3)]
// you can see that all pairs are like (i, j), (i+1, j+1), (i+2, j+2)....