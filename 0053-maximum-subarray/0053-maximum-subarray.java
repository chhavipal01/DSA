class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int n= nums.length;
          int currentSum = 0;

        
    for (int i = 0; i < n; i++) {
        
            currentSum += nums[i]; 
           if(currentSum>maxSum){
            maxSum = currentSum;
           }
           if(currentSum< 0){
            currentSum=0;
           }
        }
    

    return maxSum;
    }
}