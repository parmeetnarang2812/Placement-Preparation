class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int n = matrix.length; 
        int m = matrix[0].length; 
        int l = 0; 
        int r = n * m - 1; 
        // Applying BINARY SEARCH
        while (l <= r) {
            int mid = (l + (r - l) / 2); // Since the whole matrix is like a linearly sorted array.
            if(matrix[mid/m][mid%m]==target){        //  |             |
                return true;                         //  | 1  3  5  7  | We are treating this matrix like a sorted array
            }                                        //  | 10 11 16 20 | and applying the BINARY SEARCH.
            else if(matrix[mid/m][mid%m]<target){    //  | 23 30 34 60 | 1 3 5 7 10 11 16 20 23 30 34 60
                l=mid+1;                             //  |             |
            }                                        
            else{
                r=mid-1;
            }
        }
        return false;
    }
}

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//             return false;
//         }
//         int row = 0, col = matrix[0].length-1;
//         while(row<matrix.length && col>=0) {
//             if(matrix[row][col]==target) {
//                 return true;
//             }
//             else if(matrix[row][col]<target) {
//                 row++;
//             }
//             else {
//                 col--;
//             }
//         }
//         return false;
//     }
// }