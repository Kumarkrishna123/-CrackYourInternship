public class SubarraySumdivisolbyK {
    public static void main(String[] args) {
  int[] nums = {4,5,0,-2,-3,1} ;
          int k =5 ;
    }
    public int subarraysDivByK(int[] nums, int k) {
        int arr[] = new int[k];
        int sum = 0;
        int count = 0;
        arr[0] = 1;
        for(int i : nums) {
            sum = (i+sum)%k;
            if(sum < 0) sum += k;
            count += arr[sum];
            arr[sum]++;
        }
        return count;
    }
}
