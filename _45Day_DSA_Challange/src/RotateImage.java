package Matrix;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}} ;
    rotate(matrix);
    }
    public  static void rotate(int[][] matrix) {
        int n= matrix.length;
        int i=0; int j=n-1;
        while(i<j){
            for(int k=0; k<n; k++){
                int temp = matrix[i][k];
                matrix[i][k]=matrix[j][k];
                matrix[j][k]=temp;
            }
            i++; j--;
        }
        for(int m=0; m<n; m++){
            for(int l=m+1; l<n; l++){
                int temp = matrix[m][l];
                matrix[m][l]=matrix[l][m];
                matrix[l][m]=temp;
            }
        }
    }
}
