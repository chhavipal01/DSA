public class Solution {
    public int maxArea(int[] heights) {
       int n = heights.length;
       int i =0 , j = n-1;
       int maxWater = 0;
        while (i < j) { 
            int weight = j - i;
            int height = Math.min(heights[i], heights[j]); 
            int area = weight * height;
            maxWater = Math.max(maxWater, area);

            
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
       return maxWater;
    }
}