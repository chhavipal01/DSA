class Solution {
    public long minimumSteps(String s) {
        long steps = 0; 
        int bcount = 0; 
        
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
               
                bcount++;
            } else {
                
                steps += bcount;
            }
        }
        
        return steps;
    }
}