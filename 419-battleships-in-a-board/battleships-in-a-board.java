// class Solution {
//     public int countBattleships(char[][] board) {
//         int m = board.length;       
//         int n = board[0].length;   
//         int ans = 0;
//         for (int i = 0; i < m; i++) {
//         for (int j = 0; j < n; j++) {
//         if (board[i][j] == 'X') {
//             ans++;  
//         board[i][j] = '.';
//             while (j + 1 < n && board[i][j + 1] == 'X') {
//     board[i][j + 1] = '.';
//             j++;
//         }
//         while (i + 1 < m && board[i + 1][j] == 'X') {
//          board[i + 1][j] = '.';
//             i++;
//             }
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int countBattleships(char[][] board) {

        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == 'X') {

                    boolean noUpper = (i == 0 || board[i - 1][j] == '.');
                    boolean noBack = (j == 0 || board[i][j - 1] == '.');

                    if (noUpper && noBack) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}