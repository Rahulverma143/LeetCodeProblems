// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> ll = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             int pos = Math.abs(nums[i]) - 1;
//             if (nums[pos] < 0) {
//                 ll.add(Math.abs(nums[i]));
//             } else {
//                 nums[pos] = -nums[pos];
//             }
//         }
//         return ll;
//     }
// }

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
               
                if (res.isEmpty() || res.get(res.size() - 1) != nums[i]) {
                    res.add(nums[i]);
                }
            }
        }
        return res;
    }
}
