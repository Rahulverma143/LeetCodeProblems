class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {

        int n = towers.length;
        Arrays.sort(towers, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });
        int x1 = -1;
        int y1 = -1;
        int qf = -1; 
        int c1 = center[0];
        int c2 = center[1];
        for (int i = 0; i < n; i++) {
            int d = Math.abs(c1 - towers[i][0]) + Math.abs(c2 - towers[i][1]);
            if (d <= radius && towers[i][2] > qf) {

                x1 = towers[i][0];
                y1 = towers[i][1];
                qf = towers[i][2];
            }
        }
        int  arr[] = {x1, y1};
       return arr;
    }
}
