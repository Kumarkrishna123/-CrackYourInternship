public class WordSearch {
    public static void main(String[] args) {
       char[][] board = {
         {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
       };
       String word = "ABCB" ;
        System.out.println(exist(board , word));

    }
    public static boolean exist(char[][] board, String word) {
     int m = board.length;
     int n = board[0].length;
      boolean[][] visited =  new boolean[m][n] ;
     boolean  result = false ;
        for (int row = 0; row <m ; row++) {
            for (int col = 0; col <n ; col++) {
                if (board[row][col] == word.charAt(0)) {
                   result = backTrack(board ,word,visited ,row , col ,0 ) ;
                  if(result)   return true ;
                }
            }

        }
        return false ;
    }

    private static boolean backTrack(char[][] board, String word, boolean[][] visited, int row, int col, int index) {

        if (index == word.length()) {
           return  true ;
        }
        if ( row <0 ||board.length <=row  || (col < 0 || col>= board[0].length) || visited[row][col]|| (board[row][col]!=word.charAt(index))) {
           return false;
        }

         visited[row][col] = true ;
        if (backTrack(board , word ,visited , row +1 , col  , index+1) ||
            backTrack(board , word,visited  , row -1 , col  , index+1) ||
            backTrack(board , word,visited  , row  , col+1  , index+1)||
           backTrack(board , word,visited  , row  , col-1  , index+1)) {
            return true ;
        }
        visited[row][col] =  false ;
         return false ;
    }
}
