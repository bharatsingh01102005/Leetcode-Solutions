// Last updated: 8/2/2025, 10:46:37 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        // itrate over matrix

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == target){
                    return true; // target found
                }

            }
        }
        return false; // target not found
    }
}