public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = 0;
        for (int pile : piles) {
            hi = Math.max(hi, pile);
        }

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (canFinish(piles, h, mid)) {
                hi = mid;       
            } else {
                lo = mid + 1; 
            }
        }

        return lo;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        long totalTime = 0;
        for (int pile : piles) {
            totalTime += (int) Math.ceil((double) pile / speed);
        }
        return totalTime <= h;
    }
}