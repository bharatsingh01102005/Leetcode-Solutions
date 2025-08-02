// Last updated: 8/2/2025, 10:47:23 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[k-1]){ //unique number
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}