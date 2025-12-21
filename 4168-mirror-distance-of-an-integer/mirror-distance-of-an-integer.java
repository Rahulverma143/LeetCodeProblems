class Solution {
    public int mirrorDistance(int n) {
   int m = 0;
   int ans = n;
   while(n!=0){
    m *= 10;
    m += n % 10;
    n /= 10;
   }
   return Math.abs(ans - m);
    }
}

