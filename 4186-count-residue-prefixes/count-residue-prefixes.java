class Solution {
    public int residuePrefixes(String s) {
        boolean[] seen = new boolean[26];
        int distinctCount = 0;
        int  result = 0;
       for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
         if (!seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                distinctCount++;
            }
            int prefixLength = i + 1;
 if (distinctCount == prefixLength % 3) {
                result++;
            }
          
        }
        return result;  
    }
}