class Solution {
    private boolean check(int[] piles, int m, int h) {
        long hrs = 0;
        for (int i = 0; i < piles.length; i++) {
            hrs += (piles[i] + m - 1) / m; 
        }
        return hrs <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int i : piles) {
            r = Math.max(r, i);
        }
        int ans = r;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (check(piles, m, h)) {
                ans = m;     
                r = m - 1;   
            } else {
                l = m + 1;   
            }
        }
        return ans;
    }
}


  //   int low = 1;
    //     int high = 0;
    //     for (int p : piles) {
    //         high = Math.max(high, p);
    //     }
    //      while (low <= high) {
    //         int mid = low + (high - low) / 2; 
    //         int totalhours = 0;
    //         for(int p: piles)
    //         totalhours+=(p+mid-1)/mid;
    //         if(totalhours<=h){
    //             high = mid - 1;
    //         }
    //         else
    //         low = mid +1;
    //      }
      // return low;