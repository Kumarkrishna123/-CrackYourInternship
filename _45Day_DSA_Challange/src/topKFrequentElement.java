package Heap;

import java.util.*;

public class topKFrequentElement {
    public static void main(String[] args) {
         int[] nums = {1,1,1,2,2,3} ;
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>() ;
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1  );
        }
        Queue<Integer> maxheap = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        for (int key : map.keySet()) {
           maxheap.add(key) ;
        }
        int ans[] =  new int[k] ;
        for (int i = 0; i <k ; i++) {
            ans[i] =  maxheap.poll() ;
        }
        return ans;
    }


}
