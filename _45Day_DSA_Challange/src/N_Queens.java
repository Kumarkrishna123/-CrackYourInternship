package BackTrack;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        int  n =4 ;
        System.out.println(solveNQueens(n)) ;
    }

    public static List<List<String>>  solveNQueens(int n) {

        boolean[][] board =  new boolean[n][n] ;
        List<List<String>> result  = new ArrayList<>() ;
        queens (board , 0 , result) ;
        return result  ;

    }

    private static void queens(boolean[][] board, int row , List<List<String>> result) {
        if (row == board.length) {
            result.add(display(board)) ;

            return ;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board , row , col)) {
                board[row][col] =  true ;
                queens(board , row+1 , result) ;
                board[row][col] =  false ;
            }
        }

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical
        for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false ;
            }
        }
        // check diagonal left
        int maxLeft =  Math.min(row , col) ;
        for (int i = 0; i <=maxLeft; i++) {
            if(board[row-i][col-i]){ return false;}
        }
        // diagonal right
        int maxright =  Math.min(row , board.length-col-1) ;
        for (int i = 0; i <=maxright ; i++) {
            if (board[row-i][col+i]) {
                return false ;
            }
        }

        return true ;
    }

    private static List<String> display(boolean[][] board) {
        List<String> solution = new ArrayList<>() ;

        for (boolean[] row : board) {
            StringBuilder sb  = new StringBuilder() ;
            for (boolean elments : row) {
                sb.append(elments ?'Q' : '.') ;
            }
            solution.add((sb.toString()));
        }

        return solution;
    }
}
