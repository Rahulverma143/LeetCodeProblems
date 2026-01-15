class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        arr[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            arr[i] = Math.min(arr[i + 1], nums[i]);
        }
        long sum = 0;
        long ans = Long.MIN_VALUE;
        for(int i = 0; i < n - 1; i++) {
            sum += nums[i];
            ans = Math.max(ans, sum - arr[i + 1]);
        }
        return ans;
    }
}