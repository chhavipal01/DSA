class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ;i<tokens.length; i++){
            String t = tokens[i];
          
            if(t.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            }else if(t.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            }else if(t.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a /b);
            }else if(t.equals("-")){
               int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            }else{
                stack.push(Integer.parseInt(t));
            }

        
       
        }
        return stack.pop();
    }
}