import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; 
        Stack<Integer> stack = new Stack<>(); 

        
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }
        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n; 

            
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[index]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                res[index] = nums[stack.peek()];
            }

        
            stack.push(index);
        }

        return res;
    }
}
