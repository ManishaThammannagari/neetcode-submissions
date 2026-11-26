class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
        int a=nums[i];
        int b=target-a;
        for(int j=0;j<nums.length;j++){
            if(i!=j){
              if(nums[j]==b){
                 return new int[]{i, j};
              }
            }
        }
      }
       return new int[]{};
    }
}
