public class MaxValueEquation {
    public static void main(String[] args) {
        int[][] points  = {
                {1,3},
                {2,0},
                {5,10},
                {6,-10},

        };

        int  k =1 ;
        System.out.println(findMaxValueOfEquation(points , k));
    }
    public  static  int findMaxValueOfEquation(int[][] points, int k) {
        int ans = Integer.MIN_VALUE ;
        int i =0 ;
        int f =1 ;

        while (i<points.length){
            if(f < i+1){
                f = i+ 1 ;
            }

            for (int j = f; j < points.length; j++) {
                if (points[j][0]  > (points[i][0] +k )  ) {
                    break;
                }
                if (points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0] ) >  ans   && j >i ) {
                    ans  =  points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0]) ;

                    f = j-1 ;
                }


            }
            i++;
        }
        return  ans ;
    }
}
