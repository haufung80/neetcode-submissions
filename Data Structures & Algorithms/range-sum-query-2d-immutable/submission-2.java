class NumMatrix {
    private static int[][] prefixSum;
    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        prefixSum = new int[row][col];
        prefixSum[0][0] = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0 ) continue;
                int sum = 0;
                sum += matrix[i][j];
                if (i - 1 >= 0) sum += prefixSum[i - 1][j];
                if (j - 1 >= 0) sum += prefixSum[i][j - 1];
                if (i - 1 >= 0 && j - 1 >= 0) sum -= prefixSum[i - 1][j - 1];
                prefixSum[i][j] = sum;
            }
        }
        System.out.println(Arrays.deepToString(prefixSum));
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        res += prefixSum[row2][col2];
        if (row1 - 1 >= 0) res -= prefixSum[row1 - 1][col2];
        if (col1 - 1 >= 0) res -= prefixSum[row2][col1 - 1];
        if (row1 - 1 >= 0 && col1 - 1 >= 0) res += prefixSum[row1 - 1][col1 - 1];
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and
  called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */