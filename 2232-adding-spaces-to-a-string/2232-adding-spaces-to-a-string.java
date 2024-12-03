class Solution {
    public String addSpaces(String s, int[] spaces) {
       StringBuilder s1= new StringBuilder();  
        int spCount=0;
        for(int i=0; i<s.length(); i++){
            if(spCount < spaces.length && i == spaces[spCount]){
                s1.append(' ');
                spCount++;
            }
              s1.append(s.charAt(i));
        }
        return s1.toString();

    }
}