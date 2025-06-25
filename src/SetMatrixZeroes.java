public class SetMatrixZeroes {
    //Brute force
    // private void markRow(int[][] matrix, int n, int m, int i){
    //     for(int j=0; j<m; j++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    // private void markCol(int[][] matrix, int n, int m, int j){
    //     for(int i=0; i<n; i++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    // public void setZeroes(int[][] matrix) {
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(matrix[i][j] == 0){
    //                 markRow(matrix, n, m, i);
    //                 markCol(matrix, n, m, j);
    //             }

    //         }
    //     }

    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(matrix[i][j] == -1){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    //better
    // public static void setZeroes(int[][] matrix){
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     int[] col = new int[m];
    //     int[] row = new int[n];
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(matrix[i][j] == 0){
    //                 row[i] = 1;
    //                 col[j] = 1;
    //             }
    //         }
    //     }
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(row[i] == 1 || col[j] == 1){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    //optimal
    public static void setZeroes(int[][] matrix){
        int col0 = 1;
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0) col0 = 0;
            for(int j=1; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        if(matrix[0][0] == 0){
            for(int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }

}
