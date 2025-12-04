class Solution {
    public boolean checkSubarraySum(int[] nums, int k) { 
HashMap<Integer, Integer> mp = new HashMap<>();
     mp.put(0,-1);
     int sum = 0;
   for(int i =0; i<nums.length; i++){
      sum+=nums[i];
      int rem = sum%k;
  if(mp.containsKey(rem)){
     int ind=mp.get(rem);
    if(i-ind>1){
      return true;
  }}
   else {
   mp.put(rem,i);
  }
   }
  return false;
}
    }
//       int n = nums.length; 
//         for(int i = 0; i < n; i++) {
//             int sum = 0;
//             for(int j = i; j < n; j++) {
//                 sum += nums[j];
//                 if ((j - i + 1) > 1 && sum % k == 0)
//                     return true;
//             }
//         }
//         return false;
//     }
// }
