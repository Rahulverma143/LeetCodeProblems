// class Solution {
//     public int eraseOverlapIntervals(int[][] intervals) {
//         Arrays.sort(intervals,(a,b)->a[1]-b[1]);
//         int min=intervals[0][1];
//         int n=intervals.length;
//         int count=0;
        
//         for(int i=1;i<n;i++){
//             int low=intervals[i][0];
//             int high=intervals[i][1];
//             if(low<min)count++;
//             else min=high;
//         }
//         return count;
//     }
// }

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Sort intervals based on the end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int end = intervals[0][1];
        int count = 1;

        // Iterate through the sorted intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                // Non-overlapping interval found, update end time
                end = intervals[i][1];
                count++;
            }
        }

        // Calculate the number of intervals to remove
        return intervals.length - count;
    }
}