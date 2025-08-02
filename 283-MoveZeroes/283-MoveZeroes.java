// Last updated: 8/2/2025, 10:45:50 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                if(i != k){
                    int temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                }

                k++;
            }
        }
    }
}