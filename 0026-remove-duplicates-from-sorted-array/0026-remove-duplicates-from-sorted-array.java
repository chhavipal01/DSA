class Solution {
    public int removeDuplicates(int[] nums) {
        
        int m = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}
       

    
