class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int Row = matrix.length, Col = matrix[0].length;
        int low = 0, high = Row * Col - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / Col, col = mid % Col;  

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
