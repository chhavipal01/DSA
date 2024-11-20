class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length / 2;

        HashSet<Integer> uniquePair = new HashSet<>();
        for (int candy : candyType) {
            uniquePair.add(candy);
        }

        
        return Math.min(n, uniquePair.size());
    }
}
