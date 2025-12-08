class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1]; 
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i]; 
            freq[x]++;   
        }

        int duplicate = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;     // number repeated twice
            } 
            else if (freq[i] == 0) {
                missing = i;       // number not present
            }
        }

        return new int[]{duplicate, missing};
    }
}
