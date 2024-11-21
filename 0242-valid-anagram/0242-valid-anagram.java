class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length() != t.length()){
        return false;
      }
       char[] as = s.toCharArray();
        char[] at = t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(at);
        String a=new String(as);
        String b=new String(at);

        if(a.equals(b)){
            return true;
        }else{
            return false;
        }
      

      
    }
}