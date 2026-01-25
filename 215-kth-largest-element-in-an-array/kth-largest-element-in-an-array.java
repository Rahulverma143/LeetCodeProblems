// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i: nums) {
//             if(pq.size() <k) {
//                 pq.add(i);
//             } else {
//                 if(pq.peek() > i) continue;

//                 pq.poll();
//                 pq.add(i);
//             }
//         }
//         return pq.poll();
//     }
// }


class Solution {
    public int findKthLargest(int[] nums, int k) {
PriorityQueue<Integer> pq = new PriorityQueue<>();
int temp =k;
for(int i = 0; i<nums.length; i++){
    if(temp>0){
        pq.add(nums[i]);
        temp--;
    }
    else
    {
        if(pq.peek()<nums[i]){
            pq.poll();
            pq.add(nums[i]);
        }
    }
}
return pq.peek();
}
}