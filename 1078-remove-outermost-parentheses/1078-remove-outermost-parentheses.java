class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder(); 
        int cnt = 0; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                if (cnt > 0) {
                    result.append(c); 
                }
                cnt++; 
            } else if (c == ')') {
                cnt--; 
                if (cnt > 0) {
                    result.append(c);
                }
            }
        }
        
        return result.toString(); 
    }
}
