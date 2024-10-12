class Solution {
    public void sortColors(int[] nums) {
    
        // WE can sort this array using dutch algo.

        int low=0;
        int mid =0;
        int high =nums.length-1;
        while(mid<=high){
            if(nums[mid]==0)
            {
                int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;
                    low++;
                    mid++;
            }
            else if(nums[mid]==1){
                mid++;

            }
            else if(nums[mid]==2){
                  int temp2 = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp2;
                    high--;
            }
        }
        
    }
}