import java.util.HashMap;

public class SubarraySumsEqualK {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subarraySum(nums , 3));

    }
    public  static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int presum=0;int c=0;
        for(int i=0;i<nums.length;i++){
            presum=presum+nums[i];
            int find=presum-k;
            c=c+mpp.getOrDefault(find,0);
            mpp.put(presum,mpp.getOrDefault(presum,0)+1);
        }
        return c;

    }
}
