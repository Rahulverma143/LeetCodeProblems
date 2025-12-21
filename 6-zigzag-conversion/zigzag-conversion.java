class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
     rows[i] = "";
        }
        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            rows[row] = rows[row] + s.charAt(i);
            if (row == numRows - 1)
        down = false;
            else if (row == 0)
         down = true;
            row = down ? row + 1 : row - 1;
        }
        String ans = "";
        for (int i = 0; i < numRows; i++) {
            ans = ans + rows[i];
        }
        return ans;
    }
}
