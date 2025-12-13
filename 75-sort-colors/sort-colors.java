class Solution {
    public void sortColors(int[] nums) {
        int x= 0;
        int y = 0;
        int z = 0;
    for(int i =0; i<nums.length; i++){
        if(nums[i] == 0){
            x++;
        }
        else if(nums[i] == 1){
            y++;
        }
       else if(nums[i] == 2){
        z++;
       }
    }
    int k = 0;
    for(int i = 0; i<x; i++){
        nums[k]=0;
        k++;
    }
  for(int i = 0; i<y; i++){
        nums[k]=1;
        k++;
    }
      for(int i = 0; i<z; i++){
        nums[k]=2;
        k++;
    }
    }
}