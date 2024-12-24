class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        
        for(int i= 0 ; i<operations.length; i++){
             String op = operations[i];
     
            if(op.equals("+")){
              int top = stack.pop();
              int newScore = top+stack.peek();
              stack.push(top);
              stack.push(newScore);

            }else if(op.equals("D")){
                stack.push(2*stack.peek());
            }else if(op.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
         int total = 0;
        while (!stack.isEmpty()) {
            total += stack.pop();
        }
        return total;
        
    }
}