// Last updated: 8/2/2025, 10:45:08 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i =1; i<nums.length; i++){
           nums[i]= nums[i]+nums[i-1];
        }
      return nums;  
    }
}