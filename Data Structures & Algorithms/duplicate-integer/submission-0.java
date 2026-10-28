class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        boolean check =false;
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
               check=true;
            }
        }
return check;
        
    }
}