class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int pile : piles) {
            r = Math.max(pile, r);
        }
        int res = r;
        
        while(l <= r) {
            long totalTime = 0;
            int m = (l+r) / 2;
            for(int p : piles) {
                totalTime += Math.ceil((double)p/m);
            }
            if(totalTime <= h) {
                res = m;
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return res;
    }
}
