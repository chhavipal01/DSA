class Solution {
    public long coloredCells(int n) {
        long count =1;
        long jump = 4;
        while(n>1){
            count += jump;
            jump += 4;
            n--;
        }
        return count;
    }
}