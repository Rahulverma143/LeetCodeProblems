class Solution {
    private int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if ("aeiou".indexOf(str.charAt(i)) != -1)
                count++;
        return count;
    }

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int vow = count(arr[0]);
        StringBuilder sb = new StringBuilder(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (count(arr[i]) == vow) {
                StringBuilder sb1 = new StringBuilder(arr[i]);
                sb.append(" " + sb1.reverse().toString());
            } else
                sb.append(" " + arr[i]);
        }
        return sb.toString();
    }
}