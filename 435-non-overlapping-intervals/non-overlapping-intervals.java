class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int min=intervals[0][1];
        int n=intervals.length;
        int count=0;
        
        for(int i=1;i<n;i++){
            int low=intervals[i][0];
            int high=intervals[i][1];
            if(low<min)count++;
            else min=high;
        }
        return count;
    }
}