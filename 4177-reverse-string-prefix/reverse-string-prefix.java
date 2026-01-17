// class Solution {
//     public String reversePrefix(String s, int k) {
//         int n = s.length();
//         String ans = "";
//         String rev ="";
//         for(int i =k-1 ;i>=0 ;i--){
//             char ch = s.charAt(i);
//             rev += ch;
//         }
//         ans = ans + rev;
//         for(int i = k;i<n ;i++){
//             ans = ans + s.charAt(i);
//         }
//         return ans;
//     }
// }

class Solution {
    public String reversePrefix(String s, int k) {
        char arr[] = s.toCharArray();
        int start = 0;
        int end = k-1;
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;            
        }
        return new String(arr);
    }
}
