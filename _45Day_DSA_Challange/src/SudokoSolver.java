package BackTrack;

public class SudokoSolver {
    public static void main(String[] args) {
        char[][] board = {new char[]
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}

        } ;
        solveSudoku(board) ;
        display(board);

    }

    public static void  solveSudoku(char[][] board) {
        solve(board) ;
    }
    static boolean solve(char[][] board){
        int n =  board.length ;
        int row = -1 ;
        int col = -1 ;
        boolean emptyLeft  = true ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some element in row . then break
            if (!emptyLeft ) {
                break;
            }
        }
        if (emptyLeft) {
            return true;// sudoku is solved
        }
        // backtrack
        for (char number ='1'; number <='9' ; number++) {
            if (isSafe(board , row , col , number)) {
                board[row][col] =  number ;
                if (solve(board) ) {
                    return true ;//  found the answer
                }
                else {// backtrack
                    board[row][col] = '.' ;
                }
            }
        }
        return false ;
    }

    private static void display(char[][] board) {
        for (char[] row :  board ){
            for (char n : row) {
                System.out.print(n + " ");

            }
            System.out.println();
        }
    }


    static boolean isSafe(char[][] board , int row,  int col , int num ){
        //  check the row
        for (int i = 0; i < board.length; i++) {
            //   check if the number is int thr row
            if (board[row][i] == num) {
                return false ;
            }
        }
        //  check the col
        for (int i = 0; i <board.length ; i++) {
            //   check if the number is in  the col
            if (board[i][col] == num) {
                return false ;
            }
        }
        int sqrt =  (int)(Math.sqrt(board.length)) ;
        int rowStart =  row - row% sqrt ;
        int colStart =  col - col%sqrt;
        for (int i = rowStart; i <rowStart + sqrt ; i++) {
            for (int j = colStart; j <colStart +sqrt ; j++) {
                if (board[i][j] == num) {
                    return false ;
                }
            }
        }
        return true ;

    }

}
