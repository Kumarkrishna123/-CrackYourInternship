package Heap;

import java.util.ArrayList;
import java.util.Collections;

public class FarthestBuildingCanReach {
    public static void main(String[] args) {
        int[] heights = {4, 2, 7, 6, 9, 14, 12} ; int  bricks = 5, ladders = 1 ;
        System.out.println(furthestBuilding(heights , bricks , ladders));
    }
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        int l = 0, r = n - 1, ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            ArrayList<Integer> A = new ArrayList<>();

            for (int i = 1; i <= mid; i++) {
                if (heights[i - 1] < heights[i]) {
                    A.add(heights[i] - heights[i - 1]);
                }
            }

            Collections.sort(A);

            long sum = 0;
            for (int i = 0; i < A.size() - ladders; i++) {
                sum += A.get(i);
            }
            if (bricks >= sum) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
