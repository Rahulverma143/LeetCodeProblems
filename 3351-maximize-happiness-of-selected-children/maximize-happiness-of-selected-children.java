class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long sum = 0;
        for(int i = 0; i<k; i++){
            long max = happiness[n-1-i]-i;
            if(max>0){
            sum =sum+max;
            }
        }
        return sum;
    }
}