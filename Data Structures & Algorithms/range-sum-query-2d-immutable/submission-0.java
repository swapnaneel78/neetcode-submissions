class NumMatrix {
    int[][] matrix1;
    public NumMatrix(int[][] matrix) {
        int a=matrix.length;
        int b=matrix[0].length;
        matrix1=new int[a+1][b+1];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                matrix1[i+1][j+1]=matrix[i][j]+matrix1[i+1][j]+matrix1[i][j+1]-matrix1[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=matrix1[row2+1][col2+1]-matrix1[row1][col2+1]-matrix1[row2+1][col1]+matrix1[row1][col1];
        return sum;
    }
}