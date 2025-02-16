class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // Find the maximum number of bananas in a pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        // Apply binary search to find the minimum possible speed
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canEatAll(piles, h, mid)) {
                high = mid; // Try a lower speed
            } else {
                low = mid + 1; // Increase speed
            }
        }
        return low;
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += Math.ceil((double) pile / k);
        }
        return hoursNeeded <= h;
    }
}