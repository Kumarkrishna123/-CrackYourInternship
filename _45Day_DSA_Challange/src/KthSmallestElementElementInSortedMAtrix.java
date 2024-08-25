package Heap;

public class KthSmallestElementElementInSortedMAtrix {
    public static void main(String[] args) {
       int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}}; int k = 8 ;
        System.out.println(kthSmallest(matrix , k));
    }
        public static int kthSmallest(int[][] matrix, int k) {
            int row = matrix.length;
            int col = matrix[0].length;

            int low = matrix[0][0];
            int high = matrix[row - 1][col - 1];

            while (low < high) {
                int mid = low + (high - low) / 2;
                int count = 0;
                int j = col - 1;

                for (int i = 0; i < row; i++) {
                    while (j >= 0 && matrix[i][j] > mid)
                        j--;

                    count += j + 1;  // `j + 1` indicates how many elements in row `i` are <= `mid`
                }

                if (count < k) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            return low;
        }

}
