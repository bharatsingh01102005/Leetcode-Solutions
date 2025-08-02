// Last updated: 8/2/2025, 10:46:11 PM
//import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2]; 
    }
}
