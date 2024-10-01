class Solution {
    public String reverseWords(String s) {

        String rev ="";
        String array[] = s.split("\\s+");
        for(int i=array.length-1 ; i>=0; i--)
        {
            rev = rev + array[i];
            if(i>0){
                rev= rev+" ";
            }
        }
        return rev.trim();
        
    }
}