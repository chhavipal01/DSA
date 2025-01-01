class Solution {
    public int maxScore(String s) {
    int totalOnes = 0; 
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }
        
        int maxScore = 0;
        int zerosInLeft = 0;
        int onesInRight = totalOnes;

        
        for (int i = 0; i < s.length() - 1; i++) { 
            if (s.charAt(i) == '0') {
                zerosInLeft++;
            } else {
                onesInRight--;
            }
            
            
            int score = zerosInLeft + onesInRight;
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;

  
   
    }
}  