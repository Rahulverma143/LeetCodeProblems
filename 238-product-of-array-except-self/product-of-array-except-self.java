class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] pre = new int[n];
        pre[0] = nums[0];

        for(int i = 1; i<n; i++)
        pre[i] = pre[i-1]*nums[i];
        int[] res = new int[n];
        res[n-1]=pre[n-2];
   int prod= nums[n-1];
   for(int i = n-2; i>=0; i--){
    if(i>0)
    res[i]=pre[i-1]*prod;
    else
    res[i]=prod;
    prod*=nums[i];
   }
   return res;
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int [] ans = new int[n];
//         for(int i = 0; i<n; i++){
//             int temp = 1;
//             for(int j = 0; j<n; j++){
//                 if(i!=j)
//                     temp = temp * nums[j];
//             }
//             ans[i] = temp;   
//         }
//       return ans;
//     }
// }