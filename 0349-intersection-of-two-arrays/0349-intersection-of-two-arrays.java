class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> map = new  HashSet<>();
          HashSet<Integer> resultmap = new  HashSet<>();
         for(int num : nums1){
            map.add(num);
         }
         for(int num : nums2){
           if( map.contains(num)){
            resultmap.add(num);
           }
            
         }
         int [] result =new int[resultmap.size()];
          int i = 0;
        for (int num : resultmap) {
            result[i++] = num;
        }
    return result;
}
}