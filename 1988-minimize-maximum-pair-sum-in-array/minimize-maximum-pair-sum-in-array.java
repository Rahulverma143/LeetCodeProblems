class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
         int maxSum = 0;
         int first = 0;
         int last = nums.length - 1;
     while(first < last){
        int pairSum = nums[first] + nums[last];
        maxSum = Math.max(maxSum, pairSum);
        first++;
        last--;
     }
     return maxSum;
    
    }
}