// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] words = s.trim().split(" ");
//         String last = words[words.length - 1];
//         return last.length();
//     }
// }
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces at the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
