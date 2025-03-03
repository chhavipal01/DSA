class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[]  result = new int[nums.length];
        int index = 0;

        for(int num : nums){
            if(num < pivot){
                result[index] = num;
                index++;
            }
        }
         for(int num : nums){
            if(num == pivot){
                result[index] = num;
                index++;
            }
        }
         for(int num : nums){
            if(num > pivot){
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}