import java.util.ArrayList;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < asteroids.length; i++) {
            int aster = asteroids[i];

            if (aster > 0) {
                arr.add(aster);
            } else {
                while (!arr.isEmpty() && arr.get(arr.size() - 1) > 0 && arr.get(arr.size() - 1) < Math.abs(aster)) {
                    arr.remove(arr.size() - 1);
                }
                
                if (!arr.isEmpty() && arr.get(arr.size() - 1) == Math.abs(aster)) {
                    arr.remove(arr.size() - 1);
                } else if (arr.isEmpty() || arr.get(arr.size() - 1) < 0) {
                    arr.add(aster);
                }
            }
        }

        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}
