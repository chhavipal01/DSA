class Solution {
    public boolean isValid(String s) {
       Stack <Character > stk= new  Stack <>();
        
        for (int i = 0; i<s.length(); i++){    
            char c= s.charAt(i);
            if(c =='(' || c== '{' || c=='['){
                stk.push(c);
            }else if(c ==')' || c== '}' || c==']'){
                if(stk.isEmpty()){
                    return false;
                }
                 

             char top = stk.pop();
              if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
       return stk.isEmpty(); 
    }
}