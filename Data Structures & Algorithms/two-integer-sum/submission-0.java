class Solution {
    public int[] twoSum(int[] nums, int target) {

        int res[]=new int[2];
        boolean flag=false;
      for(int i=0;i<nums.length;i++){
        int a=nums[i];
        int b=target-a;
        for(int j=0;j<nums.length;j++){
            if(i!=j){
              if(nums[j]==b){
                 res[0]=i;
                 res[1]=j;
                 flag=true;
                 break;
              }
            }
        }
        if(flag==true)
        break;
      }
      return res;
    }
}
