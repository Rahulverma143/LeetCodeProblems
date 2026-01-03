// class Solution {
//     public int arrangeCoins(int n) {
//     if(n==1)
//     return 1;
//    int row = 0;
// for(int i = 1; ; i++){
//       n-=i;
//     if(n<=0)
//     break;
//     row++;
// } 
// return row;
//     }
// }
class Solution {
    public int arrangeCoins(int n) {
        int row = 0;
        for (int i = 1; n >= i; i++) {
            n -= i;
            row++;
        }
        return row;
    }
}

// class Solution {
//     public int arrangeCoins(int n) {
//         int i = 1; 
// 		while(n > 0){ 
// 			i++;
// 			n = n-i; 
// 		}
// 		return i-1; 
//     }
// }
// class Solution {
//     public int arrangeCoins(int n) {
//         long start= 0;
//         long end = n;
//         long ans=0;
//         while(start<=end);{
//         long mid = start + (end-start)/2;
//         if(sum(mid)<=n){
//             ans=mid;
//             start=mid+1;
//         }
//         else 
//         end = mid -1;
//     }
//     return ans;
//     }
// }
