class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n = nums.length; 
        Map<Integer, Integer> mpp = new HashMap();
        int preSum = 0, cnt = 0;

         mpp.put(0, 1); 
        for (int i = 0; i < n; i++) {
              preSum += nums[i];
               int remove = preSum - k;
                 // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;

    }
}