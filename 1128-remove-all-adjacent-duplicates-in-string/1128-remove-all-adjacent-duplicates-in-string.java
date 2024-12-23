class Solution {
    public String removeDuplicates(String s) {

     Stack<Character> stack = new Stack<>();
      for(int i=0 ; i<s.length();i++){
        char ch= s.charAt(i);
        if(!stack.isEmpty()){
           if(ch==stack.peek()){
            stack.pop();
           }else{
            stack.push(ch);
           }
        }else{
            stack.push(ch);
        }
       
      }
      StringBuilder result = new StringBuilder();
       for(char c: stack){
        result.append(c);
       }
      return result.toString();
        
    }
}