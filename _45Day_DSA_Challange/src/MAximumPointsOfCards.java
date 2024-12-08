public class MAximumPointsOfCards {
    public static void main(String[] args) {
        int[] cardPoints = {100,40,17,9,73,75} ;
        System.out.println( maxScore(cardPoints , 3 ) );
    }
    public static int maxScore(int[] cardPoints, int k) {
        int n =  cardPoints.length ;
        int rightSum =0 ;
        int lestSum = 0 ;
        int maxSum = 0 ;
        for (int i = 0; i <k ; i++) {
            lestSum+=cardPoints[i] ;
        }
//        maxSum =  Math.max(lestSum , maxSum) ;
        for (int i = n-k; i < n ; i++) {
//            lestSum -=cardPoints[i] ;
            rightSum+=cardPoints[i] ;
             maxSum =  Math.max(lestSum ,  rightSum) ;
        }

        return maxSum;
    }

}
