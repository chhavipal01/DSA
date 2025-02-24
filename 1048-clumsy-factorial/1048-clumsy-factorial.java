class Solution {
    public int clumsy(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2 * 1;
        if (n == 3) return 3 * 2 / 1;
        if (n == 4) return 4 * 3 / 2 + 1;
        
        int result = n * (n - 1) / (n - 2) + (n - 3);
        n -= 4;
        
        while (n >= 4) {
            result -= (n * (n - 1) / (n - 2)) - (n - 3);
            n -= 4;
        }
        
        if (n == 3) result -= 3 * 2 / 1;
        else if (n == 2) result -= 2 * 1;
        else if (n == 1) result -= 1;
        
        return result;
    }
}
