public class RotateImage {
    public void rotate(int[][] matrix) {
        // int n = matrix.length;
        // //int m = matrix[0].length;
        // int[][] rotated = new int[n][n];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         rotated[j][n-i-1] = matrix[i][j];
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         matrix[i][j] = rotated[i][j];
        //     }
        // }

        //optimal
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }

    }
}
