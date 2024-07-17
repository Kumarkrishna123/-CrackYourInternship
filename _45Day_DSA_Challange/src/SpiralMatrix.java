import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = m - 1;
        int colStart = 0;
        int colEnd = n - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // traverse right
            for (int col = colStart; col <= colEnd; col++) {
                list.add(matrix[rowStart][col]);
            }
            rowStart++;
            //  print down col
            for (int row = rowStart; row <= rowEnd; row++) {
                list.add(matrix[row][colEnd]);
            }
            colEnd--;
            // print bottom row
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    list.add(matrix[rowEnd][col]);
                }
            }
            rowEnd--;
            // print up left col
            if (colEnd >= colStart) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    list.add(matrix[row][colStart]);
                }
            }
            colStart++;
        }
        return list;
    }
}

